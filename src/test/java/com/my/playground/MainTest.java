package com.my.playground;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

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
        Main.main(null);
        // then
        assertEquals(expected, actual.toString());
    }
}