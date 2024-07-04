package com.example.articleproject.services;

import com.example.articleproject.dto.ArticleDTO;
import com.example.articleproject.entities.Article;

import java.util.List;

public interface IArticleService {

    ArticleDTO addArticle(ArticleDTO a);
    Article updateArticle(Article a);
    List<ArticleDTO> getAllArticles();
    ArticleDTO getArticleById(long id);
    void deleteArticleById(long id);
    void deleteArticle(Article a);
}
