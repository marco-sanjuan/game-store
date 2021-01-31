package com.marco.gamestore.game.domain;

import com.marco.gamestore.shared.domain.model.UuidVO;
import lombok.Value;

@Value
public class GameId extends UuidVO {

    public GameId(String uuidString) {
        super(uuidString);
    }
}
