package com.kthong3.Service;

import com.kthong3.Dao.ArticleDao;
import com.kthong3.Entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ArticleService {

    @Autowired
    private ArticleDao articleDao;

    public Collection<Article> getAllArticles() {
        return this.articleDao.getAllArticles();
    }

    public Article getArticleById(int id) {
        return this.articleDao.getArticleById(id);
    }

    public void removeArticleById(int id) {
        this.articleDao.removeArticleById(id);
    }

    public void updateArticle(Article article){
        this.articleDao.updateArticle(article);
    }

    public void addNewArticle(Article article) {
        this.articleDao.addNewArticleToDb(article);
    }
}
