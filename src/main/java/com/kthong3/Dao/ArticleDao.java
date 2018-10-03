package com.kthong3.Dao;

import com.kthong3.Entity.Article;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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
}