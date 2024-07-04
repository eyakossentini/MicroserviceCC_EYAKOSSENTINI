package com.example.articleproject.controllers;

import com.example.articleproject.dto.ArticleDTO;
import com.example.articleproject.entities.Article;
import com.example.articleproject.services.IArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private IArticleService ias;
    @PostMapping("/addArticle")
    public ArticleDTO ajouterArticle(@RequestBody ArticleDTO a){
        return ias.addArticle(a);
    }


    @GetMapping("/getArticles")
    public List<ArticleDTO> getAllContrat(){return ias.getAllArticles();}


    @GetMapping("/getbyid/{id}")
    public ArticleDTO GetById(@PathVariable("id") Long id) {
        return ias.getArticleById(id);
    }

    @PostMapping("/updateArticle")
    public Article updateArticle(Article a){
        return ias.updateArticle(a);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteArticleById(@PathVariable("id") Long id) {
        ias.deleteArticleById(id);
    }


}

