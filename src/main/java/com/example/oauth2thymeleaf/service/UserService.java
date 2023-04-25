package com.example.oauth2thymeleaf.service;

import com.example.oauth2thymeleaf.dto.UserRegistrationDto;
import com.example.oauth2thymeleaf.entities.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
