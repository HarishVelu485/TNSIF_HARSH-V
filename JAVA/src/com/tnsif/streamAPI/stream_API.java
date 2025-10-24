package com.tnsif.streamAPI;

import java.util.Scanner;
import java.util.stream.IntStream;

public class stream_API {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find factorial:");
        int num = scan.nextInt();

        // Using Stream API to calculate factorial
        int factorial = IntStream.rangeClosed(1, num)
                                 .reduce(1, (a, b) -> a * b);

        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
