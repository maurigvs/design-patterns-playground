package com.my.playground.strategy;

import com.my.playground.strategy.context.TransportContext;
import com.my.playground.strategy.entities.Bus;
import com.my.playground.strategy.entities.Car;
import com.my.playground.strategy.entities.Plane;
import com.my.playground.strategy.entities.Taxi;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestStrategy {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void should_PrintMessage_when_CarIsChosen(){
        // given
        var transportContext = new TransportContext(new Car());
        // when
        transportContext.chooseTransport();
        // then
        assertEquals("User opted to go by Car\n", outContent.toString());
    }

    @Test
    public void should_PrintMessage_when_BusIsChosen(){
        // given
        var transportContext = new TransportContext(new Bus());
        // when
        transportContext.chooseTransport();
        // then
        assertEquals("User opted to go by Bus\n", outContent.toString());
    }

    @Test
    public void should_PrintMessage_when_TaxiIsChosen(){
        // given
        var transportContext = new TransportContext(new Taxi());
        // when
        transportContext.chooseTransport();
        // then
        assertEquals("User opted to go by Taxi\n", outContent.toString());
    }

    @Test
    public void should_PrintMessage_when_PlaneIsChosen(){
        // given
        var transportContext = new TransportContext(new Plane());
        // when
        transportContext.chooseTransport();
        // then
        assertEquals("User opted to go by Plane\n", outContent.toString());
    }
}
