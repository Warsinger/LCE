package com.blogspot.kateel.hslce.client;

import com.blogspot.kateel.hslce.FizzBuzz;

/**
 * Created with IntelliJ IDEA. User: mlee Date: 12/11/13 Time: 9:33 AM
 */
public class FBClient {
    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.printFizzBuzz();
        fb.printFizzBuzz(20, 243);
        fb.printFizzBuzz(-10, 10);
    }
}
