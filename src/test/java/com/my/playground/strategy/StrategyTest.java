package com.my.playground.strategy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    private final ByteArrayOutputStream actual = new ByteArrayOutputStream();
    private final PrintStream original = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(actual));
    }

    @AfterEach
    void tearDown() {
        System.setOut(original);
    }

    @Test
    void should_PrintMessagel_when_Callmain() {
        // given
        String expected = "Hello world!\n";
        // when
        MainStrategy.main(null);
        // then
        assertEquals(expected, actual.toString());
    }

    @Test
    void should_PrintMessage_when_CarIsChoosen(){
        // given
        String mode = "CAR";
        String expected = "User opted to go by Car!\n";
        // when
        MainStrategy.chooseTransport(mode);
        // then
        assertEquals(expected, actual.toString());
    }

    @Test
    void should_PrintMessage_when_BusIsChoosen(){
        // given
        String mode = "BUS";
        String expected = "User opted to go by Bus!\n";
        // when
        MainStrategy.chooseTransport(mode);
        // then
        assertEquals(expected, actual.toString());
    }

    @Test
    void should_PrintMessage_when_TaxiIsChoosen(){
        // given
        String mode = "TAXI";
        String expected = "User opted to go by Taxi!\n";
        // when
        MainStrategy.chooseTransport(mode);
        // then
        assertEquals(expected, actual.toString());
    }
}