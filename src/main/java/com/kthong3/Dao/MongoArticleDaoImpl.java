package com.kthong3.Dao;

import com.kthong3.Entity.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class MongoArticleDaoImpl implements ArticleDao {

    @Override
    public Collection<Article> getAllArticles() {
        return new ArrayList<Article>(){
            {
                add(new Article(1, "Kevin Kwan", "China Rich Girlfriend"));
            }
        };
    }

    @Override
    public Article getArticleById(int id) {
        return null;
    }

    @Override
    public void removeArticleById(int id) {

    }

    @Override
    public void updateArticle(Article article) {

    }

    @Override
    public void addNewArticleToDb(Article article) {

    }
}
