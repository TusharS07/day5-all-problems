package com.bridgelabz.day5;
import java.util.Scanner;
public class Factor {
    public static void main(String[]args)
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //
        while( n%2 == 0 )
        {
            System.out.print(2 +" ");
            n=n/2;
        }
        for(int i=3; i*i <= n; i+=2)
        {
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if(n > 2)
            System.out.print(n);
    }
}
