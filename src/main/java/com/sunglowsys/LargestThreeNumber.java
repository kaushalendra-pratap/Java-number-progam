package com.sunglowsys;

import java.util.Scanner;

public class LargestThreeNumber {
    public static void main(String[] args) {
        int a , b, c,largest,tem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the print first Number");
        a = scanner.nextInt();
        System.out.println("enter the second last number");
        b = scanner.nextInt();
        System.out.println("Enter the last number");
        c = scanner.nextInt();
        tem = a>b?a:b;
        largest = c>tem?c:tem;
        System.out.println("the largest number is i to:" +largest);
    }
}
