package com.example.collatz;

public class Main {
    public static void main(String[] args) throws InterruptedException {
	    float number = Float.parseFloat(args[0]);
		while (number != 1) {
	        System.out.println(number);
	        if (number % 2 == 0) {
	            number /= 2;
            } else {
	            number = number * 3 + 1;
            }
	        Thread.sleep(50);
        }
		System.out.println(number);
	}
}
