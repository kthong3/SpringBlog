package com.kthong3.Controller;

import com.kthong3.Entity.Article;
import com.kthong3.Service.ArticleService;

import java.util.Collection;

public class ArticleController {

    private ArticleService articleService;

    public Collection<Article> getAllArticles(){
        return articleService.getAllArticles();
    }
}
