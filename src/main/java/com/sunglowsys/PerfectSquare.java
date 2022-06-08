package com.sunglowsys;

import java.util.Scanner;

public class PerfectSquare {
    static boolean checkPerfectSquare(double number) {
        double sqrt = Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (checkPerfectSquare(number)) {
            System.out.println("yes");

        }
        else {
            System.out.println("no ");
        }
    }
}
