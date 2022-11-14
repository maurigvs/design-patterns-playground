package com.my.playground.strategy.context;

import com.my.playground.strategy.interfaces.TransportStrategy;

public class TransportContext {

    public TransportStrategy transportStrategy;

    public TransportContext(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void chooseTransport(){
        transportStrategy.selectTransport();
    }
}
