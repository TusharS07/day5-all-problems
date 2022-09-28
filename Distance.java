/*Write a program Distance.java that takes two integer command-line arguments x
and y and prints the Euclidean distance from the point (x, y) to the origin (0, 0). The
formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function*/
public class Distance {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int distance = (int) Math.sqrt(x*x + y*y);
        System.out.println("Euclidean distance from the point ("+x+ "," +y+ ") to the origin (0, 0) is " +distance);

    }
}