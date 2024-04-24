package com.ebac.memems.apiwebflux;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class APIServiceCategory {
    private final WebClient webClient;

    public APIServiceCategory(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("http://localhost:8082/memeland").build();
    }

    public String fetchDataFromApi(){
        return webClient.get().uri("/categories").retrieve().bodyToMono(String.class).block();

    }
}
