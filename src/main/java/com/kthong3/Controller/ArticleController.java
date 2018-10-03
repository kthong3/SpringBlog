package com.kthong3.Controller;

import com.kthong3.Entity.Article;
import com.kthong3.Service.ArticleService;
import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Article> getAllArticles(){
        return articleService.getAllArticles();
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Article getArticleById(@PathVariable("id") int id){
        return articleService.getArticleById(id);
    }
}
