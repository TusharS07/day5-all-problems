//Java Program to Compute Quotient and Remainder
package com.bridgelabz.day5;
import java.util.Scanner;

public class ComputeQuotientRemainder {
    static int divident, divisor;

    public static void main(String[] args) {
        //take user input dicident and divisor for calculate the Quotient and Remainder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the divident:- ");
        divident = sc.nextInt();
        System.out.println("Enter the Divisor:- ");
        divisor = sc.nextInt();

        //call method
        getComputeQuotientRemainder();

    }

    //create static method to compute Quatient and Remainder
    static void getComputeQuotientRemainder() {
        int quotient = divident / divisor;
        int remainder = divident % divisor;

        System.out.println("Quotient:- " +quotient);
        System.out.println("Remainder:- " +remainder);
    }

}
