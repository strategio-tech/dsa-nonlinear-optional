package tech.strategio;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E02Test {
    @BeforeEach
    void setup() {
        new E02();
    }

    @Test
    void test1() {
        int[][] arr = {{1,2},{2,3},{4,2}};
        assertEquals(2, E02.findCenter(arr));
    }

    @Test
    void test2() {
        int[][] arr = {{1,2},{5,1},{1,3},{1,4}};
        assertEquals(1, E02.findCenter(arr));
    }

}
