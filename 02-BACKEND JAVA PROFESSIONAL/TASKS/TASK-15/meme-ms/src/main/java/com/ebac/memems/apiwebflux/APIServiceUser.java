package com.ebac.memems.apiwebflux;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class APIServiceUser {
    private final WebClient webClient;

    public APIServiceUser(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("http://localhost:8081/memeland").build();
    }

    public String fetchDataFromApi(){
        return webClient.get().uri("/users").retrieve().bodyToMono(String.class).block();
    }
}
