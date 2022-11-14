package com.my.playground;

public class Main {
    public static void main(String[] args) {

        String[] modes = {"CAR", "BUS", "TAXI"};

        for (String mode : modes) {
            chooseTransport(mode);
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