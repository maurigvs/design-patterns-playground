package com.my.playground.strategy;

public class MainStrategy {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void chooseTransport(String mode) {

        if(mode.equals("CAR")){
            System.out.println("User opted to go by Car!");
        } else if (mode.equals("BUS")) {
            System.out.println("User opted to go by Bus!");
        } else if (mode.equals("TAXI")) {
            System.out.println("User opted to go by Taxi!");
        }
    }
}
