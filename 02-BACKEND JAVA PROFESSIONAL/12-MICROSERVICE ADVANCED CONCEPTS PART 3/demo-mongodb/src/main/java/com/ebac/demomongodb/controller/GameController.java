package com.ebac.demomongodb.controller;

import com.ebac.demomongodb.model.Game;
import com.ebac.demomongodb.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/games")
public class GameController {
    @Autowired
    private GameService service;

    @PostMapping
    public Game createGame(@RequestBody Game game) {
        return service.createGame(game);
    }

    @GetMapping("/count")
    public Long countGames() {
        return service.count();
    }
}
