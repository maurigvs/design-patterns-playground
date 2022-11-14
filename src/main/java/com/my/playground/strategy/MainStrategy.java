package com.my.playground.strategy;

import com.my.playground.strategy.context.TransportContext;
import com.my.playground.strategy.entities.Bus;
import com.my.playground.strategy.entities.Car;
import com.my.playground.strategy.entities.Plane;
import com.my.playground.strategy.entities.Taxi;
import com.my.playground.strategy.interfaces.TransportStrategy;

import java.util.Arrays;

public class MainStrategy {
    public static void main(String[] args) {

        // Implementation
        var modesArray = new String[]{"CAR", "BUS", "TAXI", "PLANE"};

        for (String mode : modesArray) {
            chooseTransport(mode);
        }

        System.out.println("----");

        // Alternative with Strategy
        var modesList = Arrays.asList(new Car(), new Bus(), new Taxi(), new Plane());

        for (TransportStrategy mode : modesList) {
            var context = new TransportContext(mode);
            context.chooseTransport();
        }

    }

    private static void chooseTransport(String mode) {

        if(mode.equals("CAR")){
            System.out.println("User opted to go by Car");
        } else if (mode.equals("BUS")) {
            System.out.println("User opted to go by Bus");
        } else if (mode.equals("TAXI")) {
            System.out.println("User opted to go by Taxi");
        }
    }
}