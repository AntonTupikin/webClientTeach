package com.example.webclientteach;

import com.example.webclientteach.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;


@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController{

    private final UserService userService;

    @Controller
    public class GreetingController {
        @GetMapping("/greeting")
        public Mono<String> greeting() {

            return userService.someRestCall();
        }
    }
    }