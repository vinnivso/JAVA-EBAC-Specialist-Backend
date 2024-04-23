package com.ebac.demomongodb.repository;

import com.ebac.demomongodb.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface GameRepository extends MongoRepository <Game, UUID> {
    long count();
}
