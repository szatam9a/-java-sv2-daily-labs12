package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void sharedDividerTest() {
        MathAlgorithms math = new MathAlgorithms();
        assertEquals(2,math.sharedDivisor(2, 4));
        System.out.println(math.sharedDivisor(12, 4));
    }
}