package com.bridgelabz.day5;
import java.util.Scanner;
/*Leap Year
a. I/P -> Year, ensure it is a 4 digit number.
b. Logic -> Determine if it is a Leap Year.
c. O/P -> Print the year is a Leap Year or not.
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Year :: ");
        int year = sc.nextInt();
        // take n variable string to claculate the langth enter year
        String n = String.valueOf(year);

        //if condition for lengh must be 4 digit only

        if(n.length() == 4) {

            // if conditon for checking year is leap or not
            if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
                System.out.println(year + " is a Leap Year");
            }
            else {
                System.out.println(year + " is not a Leap Year");
            }

        }
        else {
            System.out.println("Invalid input...Please enter Only four Digit Year number ");
        }

    }

}
