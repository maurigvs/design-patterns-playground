package com.my.playground.strategy.entities.contexts;

import com.my.playground.strategy.TransportStrategy;

public class TransportContext {

    public TransportStrategy transportStrategy;

    public TransportContext(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void chooseTransport(){
        transportStrategy.selectTransport();
    }
}
