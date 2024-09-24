package app;

public class Main {

    private static final double CONV = 0.62137d;

    public static void main(String[] args) {

        System.out.println("Length converter application");
        System.out.println("Version 0.1");

        double miles = 13;
        double kilometers = MileToKilometer(miles);

        System.out.printf(miles + " miles is " + kilometers + " kilometers");

    }

    private static double MileToKilometer(double miles) {
        return miles / CONV;
    }

}
