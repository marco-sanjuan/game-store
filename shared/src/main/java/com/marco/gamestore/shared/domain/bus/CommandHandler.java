package com.marco.gamestore.shared.domain.bus;

public interface CommandHandler<T extends Command> {
    void handle(T command);
}
