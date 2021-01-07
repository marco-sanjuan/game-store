package com.marco.gamestore.game.application.find;

import com.marco.gamestore.game.domain.Game;
import com.marco.gamestore.game.domain.GameId;
import com.marco.gamestore.game.domain.GameRepository;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameFinder {

    private final GameRepository gameRepository;

    public Game findById(GameId gameId){
        return gameRepository.findById(gameId);
    }

}
