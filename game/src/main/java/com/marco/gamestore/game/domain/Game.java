package com.marco.gamestore.game.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Game {

    private GameId id;

    private String name;

    private GamePlatform platform;
}
