package com.marco.gamestore.shared.domain.bus;

public interface CommandBus {
    void handle(Command command);
}
