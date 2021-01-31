package com.marco.gamestore.game.infrastructure.repository;

import com.marco.gamestore.game.domain.Game;
import com.marco.gamestore.game.domain.GameId;
import com.marco.gamestore.game.domain.GamePlatform;
import com.marco.gamestore.game.domain.GameRepository;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class GameRepositoryJpa implements GameRepository {

    private final GameDAO gameDAO;

    @Override
    public Game findById(GameId gameId) {

        return gameDAO.findById(gameId.getValueAsString())
                .map( e -> new Game(new GameId(e.getId()), e.getName(), GamePlatform.valueOf(e.getPlatform())))
                .orElseThrow(() -> new RuntimeException("Game not found"));
    }
}
