package com.marco.gamestore.game.application.find;

import com.marco.gamestore.game.domain.Game;
import com.marco.gamestore.game.domain.GameId;
import com.marco.gamestore.shared.domain.bus.query.QueryHandler;
import com.marco.gamestore.shared.domain.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GameFindQueryHandler implements QueryHandler<GameFindQuery, GameFindResponse> {

    private final GameFinder gameFinder;

    @Override
    public GameFindResponse handle(GameFindQuery query) {

        Game game = gameFinder.findById(new GameId(query.getId()));

        //TODO map correctly
        return new GameFindResponse(game.getId().getValue(),
                game.getName(),
                game.getPlatform().name());
    }
}
