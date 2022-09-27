package com.bridgelabz.day5;
import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double result = 0.0;
        if (num != 0) {
            while (num > 0) {
                result = result + (double) 1 / num;
                num--;
            }
            System.out.println("Total of Harmonic Series is " + result);
        } else
            System.out.println("Invalid input");
    }
}
