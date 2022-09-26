/*a. Desc -> This program takes a command-line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P -> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic -> repeat until i equals N.
d. O/P -> Print the year is a Leap Year or not.

 */
public class PowerOf2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);  //convert string to integer for cmd line argument

        if (0 <= n && n < 31) {

            for (int i = 0; i <n+1; i++) {
                System.out.println("2 to the power " +i+  " is " +Math.pow(2,i));
            }
        }
        else  {
            System.out.println("Out of range");
        }

    }
}
