package com.my.playground.strategy.entities;

import com.my.playground.strategy.TransportStrategy;

public class Bus implements TransportStrategy {

    @Override
    public void selectTransport() {
        System.out.println("User opted to go by Bus!");
    }
}