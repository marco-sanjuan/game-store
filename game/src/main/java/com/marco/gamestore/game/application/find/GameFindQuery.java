package com.marco.gamestore.game.application.find;

import com.marco.gamestore.shared.domain.bus.query.Query;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class GameFindQuery implements Query {

    private final String id;
}
