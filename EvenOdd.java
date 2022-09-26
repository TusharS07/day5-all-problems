//Java Program to Check Whether a Number is Even or Odd
package com.bridgelabz.day5;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:- ");
        num = sc.nextInt();

        //check the number is even or odd

        if (num%2 == 0) {
            System.out.println(num+ " is Even");
        }
        else {
            System.out.println(num+ " is Odd");
        }
    }
}
