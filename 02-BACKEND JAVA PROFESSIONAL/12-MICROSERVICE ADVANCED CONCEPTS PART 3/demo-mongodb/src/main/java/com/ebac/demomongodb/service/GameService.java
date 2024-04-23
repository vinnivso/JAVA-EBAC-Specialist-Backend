package com.ebac.demomongodb.service;

import com.ebac.demomongodb.model.Game;
import com.ebac.demomongodb.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = GameRepository.class)
public class GameService {
    @Autowired
    private GameRepository repository;

    public Game createGame(Game game) {
        return repository.insert(game);
    }

    public long count() {
        return repository.count();
    }
}
