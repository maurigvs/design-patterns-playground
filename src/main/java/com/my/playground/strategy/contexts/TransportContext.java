package com.my.playground.strategy.contexts;

import com.my.playground.strategy.interfaces.TransportStrategy;

public class TransportContext {

    public TransportStrategy strategy;

    public TransportContext(TransportStrategy strategy) {
        this.strategy = strategy;
    }

    public void chooseTransport(){
        strategy.selectTransport();
    }
}
