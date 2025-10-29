package com.example.Demo.onTap.phan1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {
    StringManipulator sm;
    @BeforeEach
    public void setup() {
        sm = new StringManipulator();
    }
    @Test
    void beautiful_ok() {
        assertEquals("HelloWorld", sm.manipulate("Hello", "World"));
    }
    @Test
    void str1_null_throw() {
        assertThrows(NullPointerException.class, () -> sm.manipulate(null, "World"));
    }
    @Test
    void str2_null_throw() {
        assertThrows(NullPointerException.class, () -> sm.manipulate("Hello", null));
    }
}