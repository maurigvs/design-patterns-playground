package com.my.playground.strategy;

import com.my.playground.strategy.entities.Bus;
import com.my.playground.strategy.entities.Car;
import com.my.playground.strategy.entities.Taxi;
import com.my.playground.strategy.entities.contexts.TransportContext;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategySolvedTest {

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
    void should_PrintMessage_when_CarIsChoosen(){
        // given
        String expected = "User opted to go by Car!\n";
        // when
        TransportContext transportContext = new TransportContext(new Car());
        transportContext.chooseTransport();
        // then
        assertEquals(expected, actual.toString());
    }

    @Test
    void should_PrintMessage_when_BusIsChoosen(){
        // given
        String expected = "User opted to go by Bus!\n";
        // when
        TransportContext transportContext = new TransportContext(new Bus());
        transportContext.chooseTransport();
        // then
        assertEquals(expected, actual.toString());
    }

    @Test
    void should_PrintMessage_when_TaxiIsChoosen(){
        // given
        String expected = "User opted to go by Taxi!\n";
        // when
        TransportContext transportContext = new TransportContext(new Taxi());
        transportContext.chooseTransport();
        // then
        assertEquals(expected, actual.toString());
    }
}