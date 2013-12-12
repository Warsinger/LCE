package com.blogspot.kateel.hslce;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA. User: mlee Date: 12/11/13 Time: 9:38 AM
 */
public class FizzBuzzTest {
    private FizzBuzz fb;

    @Before
    public void setup() {
        fb = new FizzBuzz();
        fb.setChunkSize(100000);
    }

    @Test
    public void testPrintFizzBuzz5to10() throws Exception {
        String[] expecteds = {"buzz", "fizz", "7", "8", "fizz", "buzz"};
        List<String> results = fb.listFizzBuzz(5, 10);
        assertEquals("size of results should be the same", expecteds.length, results.size());
        for (int i = 0; i < expecteds.length; i++) {
            assertEquals("value should be expected", expecteds[i], results.get(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testlistFizzBuzzMaxInt() throws Exception {
        fb.listFizzBuzz(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testlistFizzBigChunk() throws Exception {
        fb.listFizzBuzz(1, fb.getChunkSize() + 2);
    }

    @Test
    public void testPrintFizzBuzzChunk() throws Exception {
        fb.printFizzBuzz(1, fb.getChunkSize() * 3);
    }

    @Test
    public void testPrintFizzBuzzMaxInt() throws Exception {
        fb.printFizzBuzz(Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
