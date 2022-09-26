//Java Program to Check Whether an Alphabet is Vowel or Consonant
package com.bridgelabz.day5;
import java.util.Scanner;
public class AlphabetVowelorConsonant {
    static char ch;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet :- ");
        ch = sc.next().charAt(0);

        //call method
        checkAlphabetVowelorConsonant();

    }

    static void checkAlphabetVowelorConsonant() {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Alphabet " +ch+ " is Vowel ");
        }
        else {
            System.out.println("Alphabet " +ch+ " is  Consonant");
        }
    }
}
