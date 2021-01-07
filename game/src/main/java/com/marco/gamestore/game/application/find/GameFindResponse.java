package com.marco.gamestore.game.application.find;

import com.marco.gamestore.shared.domain.bus.query.Response;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GameFindResponse implements Response {

    private String id;

    private String name;

    private String platform;

}
