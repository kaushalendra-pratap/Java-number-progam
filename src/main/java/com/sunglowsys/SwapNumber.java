package com.sunglowsys;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int a , b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        a = scanner.nextInt();
        System.out.println("enter the second number");
        b = scanner.nextInt();
        System.out.println("before swaping:");
        System.out.println("a = " +a+ ",b = " +b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swaping");
        System.out.println("a = " +a+ ",b = " +b);
    }
}
