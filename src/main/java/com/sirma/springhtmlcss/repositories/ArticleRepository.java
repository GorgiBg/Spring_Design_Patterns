package com.sirma.springhtmlcss.repositories;

import com.sirma.springhtmlcss.models.Article;
import com.sirma.springhtmlcss.models.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ArticleRepository {

    private JdbcTemplate template;

    public ArticleRepository(JdbcTemplate template) {
        this.template = template;
    }

    public void saveArticle(Article article) {
        String SQL = "INSERT INTO ARTICLES(title, content, userId) VALUES(?, ?, ?)";
        template.update(SQL, article.getTitle(), article.getContent(), article.getUserId());
    }
}
