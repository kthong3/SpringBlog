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

    public Collection<Article> getAllArticles(){
        return articleDao.getAllArticles();
    }
}
