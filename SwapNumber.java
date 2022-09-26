//Java Program to Swap Two Numbers
package com.bridgelabz.day5;
import java.util.Scanner;
public class SwapNumber {
    public static void main(String[] args) {
        //declare 3 variables ... 2 variables for number and 3rd is for swaping
        int num1, num2, temp;
        Scanner sc = new Scanner(System.in);
        //take user input 2 number
        System.out.println("Enter First Number:- ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number:- ");
        num2 = sc.nextInt();
        //befor swaping
        System.out.println("--Before swap--");
        System.out.println("First number:- " +num1);
        System.out.println("Second number:- " +num2);

        //for swaping store num1 value in temp && num1 in num2 && and num2 in temp
        temp = num1;
        num1 = num2;
        num2 = temp;

        //after swapping
        System.out.println("*--After Swapping--*");
        System.out.println("First number:- " +num1);
        System.out.println("Second number:- " +num2);

    }
}
