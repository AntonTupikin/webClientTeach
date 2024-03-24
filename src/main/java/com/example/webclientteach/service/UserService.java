package com.example.webclientteach.service;

import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    private final WebClient webClient;

    public UserService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://app.crane-record.ru/swagger-ui/index.html#/file-pattern-controller/getAll_5").build();
    }

    public Mono<String> someRestCall() {
        return this.webClient.get()
                .retrieve().bodyToMono(String.class);
    }

}