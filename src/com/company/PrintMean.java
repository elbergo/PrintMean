package com.company;

public class PrintMean {

    public static void main(String[] args) {
        //heltalsdivision (skriver ut int istället för komma-doubles)
        //
        System.out.println("Mean of 1, 1, 3, 5: " + meanCalc(1,1,3,5));
        System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1,1,3,3));
        System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1,2,3, 4));
        System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1,2,3,4));
        System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1,-11,24,2));
        System.out.println("Mean of -1, -121, 245, 2: " + meanCalc(-1,-121,245,2));
        System.out.println("Mean of -2, -121, 245, 2: " + meanCalc(-2,-121,245,2));

    }

    public static String meanCalc(double a, double b, double c, double d) { // ändrar från int till double
        // göra en sträng av mean värdet
        //lösa problemet med heltalsdivision
        double mean = (a + b + c + d ) / 4;
        String meanString = String.valueOf(mean);

        return meanString;
    }
}