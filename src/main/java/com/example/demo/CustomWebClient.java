package com.example.demo;

import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.client.WebClient;

public class CustomWebClient implements WebClient {

    private final WebClient webClient;

    public CustomWebClient(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public RequestHeadersUriSpec<?> get() {
        return webClient.get();
    }

    @Override
    public RequestHeadersUriSpec<?> head() {
        return webClient.head();
    }

    @Override
    public RequestBodyUriSpec post() {
        return webClient.post();
    }

    @Override
    public RequestBodyUriSpec put() {
        return webClient.put();
    }

    @Override
    public RequestBodyUriSpec patch() {
        return webClient.patch();
    }

    @Override
    public RequestHeadersUriSpec<?> delete() {
        return webClient.delete();
    }

    @Override
    public RequestHeadersUriSpec<?> options() {
        return webClient.options();
    }

    @Override
    public RequestBodyUriSpec method(HttpMethod httpMethod) {
        return webClient.method(httpMethod);
    }

    @Override
    public Builder mutate() {
        return webClient.mutate();
    }
}
