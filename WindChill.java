
/*Write a program WindChill.java that takes two double command-line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab. Given the
temperature t (in Fahrenheit) and the wind speed v (in miles per hour), the
National Weather Service defines the effective temperature (the wind chill) to be: */

public class WindChill {
    public static void main(String[] args) {
        double windChillTemp;

        double t = Double.parseDouble(args[0]); //temperature (Fahrenheit))
        double v = Double.parseDouble(args[1]); //wind speed (in miles per hour)

        if (t < 50 && v < 120 || v > 3) {
            windChillTemp = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
            System.out.println("WindChill:- " +windChillTemp);

        } else {
            System.out.println("invalid Input...");
        }
    }
}
