package com.marco.gamestore.shared.domain.bus.command;

public interface CommandBus {
    void handle(Command command);
}
