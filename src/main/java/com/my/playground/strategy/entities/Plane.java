package com.my.playground.strategy.entities;

import com.my.playground.strategy.interfaces.TransportStrategy;

public class Plane implements TransportStrategy {

    @Override
    public void selectTransport() {
        // TODO Auto-generated method stub
        System.out.println("User opted to go by Plane!");
    }

}
