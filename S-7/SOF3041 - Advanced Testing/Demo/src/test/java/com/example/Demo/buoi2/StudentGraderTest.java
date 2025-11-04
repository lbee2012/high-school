package com.example.Demo.buoi2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGraderTest {
    private StudentGrader grader;

    @BeforeEach
    public void setUP() {
        grader = new StudentGrader();
    }

    @Test
    public void xeploai1() {
        String result = grader.grading(35);
        String expected = "F";
        assertEquals(result, expected);
    }

    @Test
    public void xeploai2() {
        String result = grader.grading(55);
        String expected = "D";
        assertEquals(result, expected);
    }

    @Test
    public void test_diemam() {
        assertThrows(IllegalArgumentException.class, () -> grader.grading(-1));
    }

    @Test
    public void test_diemla101() {
        assertThrows(IllegalArgumentException.class, () -> grader.grading(101));
    }
}