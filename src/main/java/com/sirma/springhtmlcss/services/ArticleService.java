package com.sirma.springhtmlcss.services;

import com.sirma.springhtmlcss.models.Article;
import com.sirma.springhtmlcss.repositories.ArticleRepository;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    private ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public void register(Article article) {
        this.articleRepository.saveArticle(article);
    }
}
