/*2. Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets. */
package com.bridgelabz.day5;

public class SumOfThreeIntZero {
    public static void main(String[] args) {
        int array[] = {3, -1, -7, -4, -5, 9, -4};
        //print array
        System.out.println("array Elements:- ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        getCountTriplets(array); // call the method
        findTriplets(array);


    }

    //create static method for count triplets
    //method for display and print trh Distinct triplets

    static void getCountTriplets(int array[]) {
        int count = 0;
         //consider all triplets and count if their sum is == 0
        for (int i = 0; i < array.length - 2; i++)
            for (int j = 0; j < array.length - 1; j++)
                for (int k = 0; k < array.length; k++)
                    if (array[i] + array[j] + array[k] == 0)
                        count++;
        System.out.println("number of distinct triplets are " +count);

    }

    //create method to display or print all triplets of array

    static void findTriplets(int array[]) {
        for (int i = 0; i < array.length - 2; i++)
            for (int j = 0; j < array.length - 1; j++)
                for (int k = 0; k < array.length; k++)
                    if (array[i] + array[j] + array[k] == 0)
                        System.out.println("distinct triplets :- " +array[i]+ " " +array[j]+ " " +array[k]);
    }
}
