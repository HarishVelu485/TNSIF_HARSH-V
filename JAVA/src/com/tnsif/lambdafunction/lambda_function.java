package com.tnsif.lambdafunction;

import java.util.Scanner;

//Functional interface for factorial calculation
interface Factorial {
 int calculate(int n);
}

public class lambda_function {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number to find factorial:");
     int num = scan.nextInt();

     // Lambda expression to calculate factorial
     Factorial fact = (n) -> {
         int f = 1;
         for (int i = 1; i <= n; i++) {
             f = f * i;
         }
         return f;
     };

     int result = fact.calculate(num);
     System.out.println("Factorial of " + num + " is " + result);
 }
}
