package com.ebac.communityms.apiwebflux;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@Service
public class APIServiceMeme {
    private final WebClient webClient;

    public APIServiceMeme(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8083/memeland").build();
    }

    public List<Map<String, Object>> fetchDataFromApi(String baseUrl) {
        Mono<List> responseMono = webClient
                .get()
                .uri(baseUrl)
                .retrieve()
                .bodyToMono(List.class);

        return responseMono.block();
    }
}
