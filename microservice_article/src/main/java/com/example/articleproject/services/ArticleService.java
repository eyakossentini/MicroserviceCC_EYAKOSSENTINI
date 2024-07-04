package com.example.articleproject.services;

import com.example.articleproject.dto.ArticleDTO;
import com.example.articleproject.dto.StockDTO;
import com.example.articleproject.entities.Article;
import com.example.articleproject.mappers.ArticleMapper;
import com.example.articleproject.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
@RequiredArgsConstructor
@Service
public class ArticleService implements IArticleService{

    private final ArticleRepository articleRepository;

    private final StockClient stockClient;




    @Override
    public ArticleDTO addArticle(ArticleDTO a) {
        Article article = articleRepository.save(ArticleMapper.mapToEntity(a));
        return a;
    }

    @Override
    public Article updateArticle(Article a) {
        return  articleRepository.save(a);
    }


    @Override
    public List<ArticleDTO> getAllArticles() {
        return articleRepository.findAll()
                .stream()
                .map(article -> ArticleMapper.mapToDto(article)).
                collect(Collectors.toList()) ;
    }


    @Override
    public ArticleDTO getArticleById(long id) {
        Article article = articleRepository.findById(id).get() ;
        StockDTO stockDTO= stockClient.getById(article.getId_stock());
        return ArticleMapper.mapToDto(article,stockDTO);

    }

    @Override
    public void deleteArticleById(long id) {
        articleRepository.deleteById(id);


    }

    @Override
    public void deleteArticle(Article a) {
        articleRepository.delete(a);


    }

}
