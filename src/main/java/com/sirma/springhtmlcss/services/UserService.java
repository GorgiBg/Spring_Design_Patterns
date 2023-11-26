package com.sirma.springhtmlcss.services;

import com.sirma.springhtmlcss.models.User;
import com.sirma.springhtmlcss.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(User user) {
        this.userRepository.saveUser(user);
    }

    public User findUser(Long userId) {
       return this.userRepository.findUser(userId);
    }
}
