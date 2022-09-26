//Java Program to Find the Largest Among Three Numbers
package com.bridgelabz.day5;
import java.util.Scanner;

public class FindLargestNumber {
    static int a, b, c;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        //call method
        getLargestNumber();
    }

    static void getLargestNumber() {
        if (a >= b && b >= c) {
            System.out.println(a+ " is largest number");

        } else if (b >= c && b >= a) {
            System.out.println(b+ " is largest number");

        }
        else {
            System.out.println(c+ " is largest number");
        }
    }

}
