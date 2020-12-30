package com.marco.gamestore.shared.infrastructure.bus;

import com.marco.gamestore.shared.domain.bus.Command;
import com.marco.gamestore.shared.domain.bus.CommandBus;
import com.marco.gamestore.shared.domain.bus.CommandHandler;
import com.marco.gamestore.shared.domain.stereotype.Service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpringCommandBus implements CommandBus {

    private final Map<Class, CommandHandler> handlers;

    public SpringCommandBus(List<CommandHandler> commandHandlerImplementations) {
        this.handlers = new HashMap<>();
        commandHandlerImplementations.forEach(commandHandler -> {
            Class<?> commandClass = getCommandClass(commandHandler);
            handlers.put(commandClass, commandHandler);
        });
    }

    @Override
    public void handle(Command command) {
        if (!handlers.containsKey(command.getClass())) {
            throw new RuntimeException(String.format("No Command Handler for %s", command.getClass().getName()));
        }
        handlers.get(command.getClass()).handle(command);
    }

    private Class<?> getCommandClass(CommandHandler handler) {
        Type commandInterface = ((ParameterizedType) handler.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        return getClass(commandInterface.getTypeName());
    }

    private Class<?> getClass(String name) {
        try {
            return Class.forName(name);
        } catch (Exception e) {
            return null;
        }
    }
}