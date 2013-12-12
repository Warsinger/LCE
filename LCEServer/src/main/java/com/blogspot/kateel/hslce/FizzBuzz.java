package com.blogspot.kateel.hslce;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: mlee Date: 12/11/13 Time: 9:11 AM
 */
public class FizzBuzz {
    private int chunkSize = 10000;

    public static void main(String[] args) {
        new FizzBuzz().printFizzBuzz();
    }

    public List<String> listFizzBuzz(int start, int end) {
        if (end - start > this.chunkSize) {
            throw new IllegalArgumentException("Cannot call list method with > " + chunkSize + " range");
        }
        if (end - start < 0) {
            throw new IllegalArgumentException("end - start ended up negative; either negative range or integer overflow");
        }
        List<String> results = new ArrayList<>(Math.min(this.chunkSize, Math.abs(end - start)));
        for (int i = start; i <= end; i++) {
            StringBuilder result = new StringBuilder();
            boolean divisible = false;
            if (i % 3 == 0) {
                result.append("fizz");
                divisible = true;
            }
            if (i % 5 == 0) {
                result.append("buzz");
                divisible = true;
            }
            if (divisible) {
                results.add(result.toString());
            } else {
                results.add(String.valueOf(i));
            }
        }
        return results;
    }

    public int getChunkSize() {
        return chunkSize;
    }

    public void setChunkSize(int chunkSize) {
        this.chunkSize = chunkSize;
    }

    public void printFizzBuzz(int start, int end) {
        int chunkStart = start;
        int chunkEnd = Math.min(start + this.chunkSize, end);
        int chunkSize = chunkEnd - chunkStart;
        while (chunkStart < end) {
            List<String> results = listFizzBuzz(chunkStart, chunkEnd);
            for (String result : results) {
                System.out.println(result);
            }
            chunkStart += chunkSize;
            chunkEnd += chunkSize;
            if (chunkEnd > end) {
                chunkEnd = end;
            }
        }
    }

    public void printFizzBuzz() {
        printFizzBuzz(1, 100);
    }
}
