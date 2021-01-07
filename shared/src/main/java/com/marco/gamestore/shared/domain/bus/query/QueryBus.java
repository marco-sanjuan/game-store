package com.marco.gamestore.shared.domain.bus.query;

public interface QueryBus {
    <R> R handle(Query query);
}
