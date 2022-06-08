package com.sunglowsys;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        int a, b, c, smallest, temprature;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        a = scanner.nextInt();
        System.out.println("enter the second number");
        b = scanner.nextInt();
        System.out.println("enter the last number");

        c = scanner.nextInt();
        temprature =  a<b?a:b;
        smallest = c<temprature?c:temprature;
        System.out.println("the smallest number is" + smallest);
    }
}