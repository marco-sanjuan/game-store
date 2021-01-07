package com.marco.gamestore.shared.infrastructure.bus;

import com.marco.gamestore.shared.domain.bus.query.Query;
import com.marco.gamestore.shared.domain.bus.query.QueryBus;
import com.marco.gamestore.shared.domain.bus.query.QueryHandler;
import com.marco.gamestore.shared.domain.bus.query.Response;
import com.marco.gamestore.shared.domain.stereotype.Service;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpringQueryBus implements QueryBus {

    private final Map<Class, QueryHandler> handlers;

    public SpringQueryBus(List<QueryHandler> queryHandlerImplementations) {
        this.handlers = new HashMap<>();
        queryHandlerImplementations.forEach(handler -> {
            Class<?> queryClass = getQUeryClass(handler);
            handlers.put(queryClass, handler);
        });
    }

    @Override
    public Response handle(Query query) {
        if (!handlers.containsKey(query.getClass())) {
            throw new RuntimeException(String.format("No Query Handler for %s", query.getClass().getName()));
        }
        return handlers.get(query.getClass()).handle(query);
    }

    private Class<?> getQUeryClass(QueryHandler handler) {
        Type queryInterface = ((ParameterizedType) handler.getClass().getGenericInterfaces()[0]).getActualTypeArguments()[0];
        return getClass(queryInterface.getTypeName());
    }

    private Class<?> getClass(String name) {
        try {
            return Class.forName(name);
        } catch (Exception e) {
            return null;
        }
    }
}