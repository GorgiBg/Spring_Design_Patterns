package com.sirma.springhtmlcss.repositories;

import com.sirma.springhtmlcss.models.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    private JdbcTemplate template;

    public UserRepository(JdbcTemplate template) {
        this.template = template;
    }

    public void saveUser(User user) {
        String SQL = "INSERT INTO USERS(username, password, email) VALUES(?, ?, ?)";
        template.update(SQL, user.getUsername(), user.getPassword(), user.getEmail());
    }

    public User findUser(Long id) {
        String SQL = "SELECT id, username, password, email FROM USERS WHERE id = ?";
        return template.queryForObject(SQL, new Object[]{id}, new BeanPropertyRowMapper<>(User.class));
    }
}
