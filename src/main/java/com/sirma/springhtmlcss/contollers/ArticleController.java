package com.sirma.springhtmlcss.contollers;

import com.sirma.springhtmlcss.models.Article;
import com.sirma.springhtmlcss.models.User;
import com.sirma.springhtmlcss.services.ArticleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleController {

    private ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/register")
    public String registerArticle(@RequestBody Article article) {
        try {
            this.articleService.register(article);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Article successfully registered";
    }
}
