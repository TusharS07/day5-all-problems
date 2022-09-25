package com.bridgelabz.day5;

import java.util.Scanner;
/*
   Coin tossing class to simulate the flip of a coin
   with two sides; Heads and Tails.*/

public class FlipCoin {
    public static void main(String[]args) {
        System.out.println("enter the number of times to flip the coin:- ");
        int count=0, count1=0, count2=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        //checking for the no. of flips greater than zero or not
        if(num>0)
        {
            while(count<=num)
            {
                //probability for head or tail.
                //use randam function to get number 0 to 1
                if(Math.random()<0.5)
                {
                    count2+=1;
                }
                else
                {
                    count1+=1;
                }
                count+=1;
            }
            double tails =((double)count2/num)*100;
            double heads =((double)count1/num)*100;
            //Percentage for head and tail.
            System.out.println("Heads flip percentage= "+heads+"%");
            System.out.println("Tails flip percentage= "+tails+"%");
        }
        else
        {
            System.out.println("invalid data entered");
        }
    }

}