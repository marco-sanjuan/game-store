package com.marco.gamestore.webapp.controller;

import com.marco.gamestore.game.application.find.GameFindQuery;
import com.marco.gamestore.game.application.find.GameFindResponse;
import com.marco.gamestore.shared.domain.bus.query.QueryBus;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
@RequiredArgsConstructor
public class GameFinderController {

    private final QueryBus queryBus;

    @GetMapping(value = "/{gameId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<GameFindResponse> signUp(@PathVariable String gameId){

        GameFindQuery query = new GameFindQuery(gameId);
        GameFindResponse response = queryBus.handle(query);
        return ResponseEntity.ok(response);
    }

}
