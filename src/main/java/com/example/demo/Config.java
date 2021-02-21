package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {

    @Bean
    public CustomWebClient customWebClient(WebClient webClient) {
        return new CustomWebClient(webClient);
    }

    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
}
