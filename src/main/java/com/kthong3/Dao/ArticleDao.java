package com.kthong3.Dao;

import com.kthong3.Entity.Article;

import java.util.Collection;

public interface ArticleDao {
    Collection<Article> getAllArticles();

    Article getArticleById(int id);

    void removeArticleById(int id);

    void updateArticle(Article article);

    void addNewArticleToDb(Article article);
}
