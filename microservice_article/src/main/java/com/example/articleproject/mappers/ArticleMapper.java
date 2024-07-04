package com.example.articleproject.mappers;

import com.example.articleproject.dto.ArticleDTO;
import com.example.articleproject.dto.StockDTO;
import com.example.articleproject.entities.Article;
import org.springframework.stereotype.Service;



@Service
public class ArticleMapper  {


    public static ArticleDTO mapToDto(Article article) {

        ArticleDTO articleDTO = ArticleDTO.builder()
                .id(article.getId())
                .name(article.getName())
                .price(article.getPrice())
                .id_stock(article.getId_stock())
                .build();

        return articleDTO;
    }

    public static ArticleDTO mapToDto(Article article , StockDTO stockDTO) {

        ArticleDTO articleDTO = ArticleDTO.builder()
                .id(article.getId())
                .name(article.getName())
                .price(article.getPrice())
                .id_stock(article.getId_stock())
                .stockDTO(stockDTO)
                .build();

        return articleDTO;
    }

    public static Article mapToEntity(ArticleDTO articleDTO) {


        Article article = Article.builder()
                .id(articleDTO.getId())
                .name(articleDTO.getName())
                .price(articleDTO.getPrice())
                .id_stock(articleDTO.getId_stock())
                .build();

        return article;

    }

}
