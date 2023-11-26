package com.sirma.springhtmlcss.contollers;

import com.sirma.springhtmlcss.dtos.UserDto;
import com.sirma.springhtmlcss.dtos.UserMapper;
import com.sirma.springhtmlcss.models.User;
import com.sirma.springhtmlcss.services.UserService;
import jakarta.validation.Valid;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<List<String>> createUser(@Valid @RequestBody User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getAllErrors()
                .stream()
                .map(ObjectError::getDefaultMessage)
                .collect(Collectors.toList());

            return ResponseEntity.badRequest().body(errors);
        }

        userService.register(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(List.of("User created successfully"));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findUser(@PathVariable Long id) {
        try {
            return new ResponseEntity<>(UserMapper.toUserDto(this.userService.findUser(id)), HttpStatus.FOUND);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
