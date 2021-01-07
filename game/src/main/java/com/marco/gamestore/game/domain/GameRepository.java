package com.marco.gamestore.game.domain;

public interface GameRepository {

    Game findById(GameId gameId);
}
