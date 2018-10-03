package com.kthong3.Dao;

import com.kthong3.Entity.Article;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ArticleDao {

    private static Map<Integer, Article> articles;
    static {
        articles = new HashMap<Integer, Article>(){
            {
                put(1, new Article(1, "J.K. Rowling", "Harry Potter and the Sorcerer's Stone"));
                put(2, new Article(2, "Jenny Han", "To All The Boys I've Loved Before"));
                put(3, new Article(3, "Kevin Kwan", "Crazy Rich Asians"));
            }
        };
    }

    public Collection<Article> getAllArticles(){
        return this.articles.values();
    }

    public Article getArticleById(int id){
        return this.articles.get(id);
    }

    public void removeArticleById(int id) {
        this.articles.remove(id);
    }

    public void updateArticle(Article article){
        Article articleToUpdate = articles.get(article.getId());
        articleToUpdate.setAuthor(article.getAuthor());
        articleToUpdate.setTitle(article.getTitle());
        articles.put(article.getId(), article);
    }
}
