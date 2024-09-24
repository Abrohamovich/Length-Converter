package app;

public class Main {

    private static final double CONV = 0.62137d;

    public static void main(String[] args) {

        System.out.println("Length converter application");
        System.out.println("Version 1");

        double miles = 13;
        double kilometers = MileToKilometer(miles);
        double km = 17;
        double mls = KilometerToMile(km);

        System.out.printf(miles + " miles is " + kilometers + " kilometers, and " +
                km + " kilometers is " + mls + " miles");

    }

    private static double MileToKilometer(double miles) {
        return miles / CONV;
    }

    private static double KilometerToMile(double km) {
        return km * CONV;
    }

}
