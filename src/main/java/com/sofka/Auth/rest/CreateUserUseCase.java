package com.sofka.Auth.rest;

import com.sofka.Auth.model.User;
import com.sofka.Auth.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class CreateUserUseCase {

    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Mono<User> apply(User user) {
        return userRepository
                .save(user);
    }
}
