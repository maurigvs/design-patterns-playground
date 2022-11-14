package com.my.playground.strategy.entities;

import com.my.playground.strategy.interfaces.TransportStrategy;

public class Car implements TransportStrategy {

    @Override
    public void selectTransport() {
        System.out.println("User opted to go by Car");
    }
}
