//package com.example;

import java.util.Scanner;

/**
 * Change me.
 *
 * @author Spencer Scarlett
 * @version 1.0
 * @since 2024-03-20
 */

// TempCheck-SizeCheck class
public final class TempCheckSizeCheck {

    /** Private constructor to prevent instantiation. */
    private TempCheckSizeCheck() {
        throw new UnsupportedOperationException("Cannot instantiate");
    }

    /**
     * This is the main method.
     *
     * @param args Unused
     */

    public static float convertTempKel(final float CelsiusFLT) {
        final float KelvinFLT = (float) (CelsiusFLT + 273.15);
        return KelvinFLT;
    }

    public static float convertTempFah(final float CelsiusFLT) {
        // Fahrenheit calculation
        final float FahrenheitFLT = (float) ((CelsiusFLT * 1.8) + 32);
        return FahrenheitFLT;
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        boolean programState = true;
        while (programState) {
            System.out.println("Enter 1 to start or 0 to quit");
            String programStateSTR = in.nextLine();
            try {
                Integer programStateINT = Integer.parseInt(programStateSTR);
                if (programStateINT == 1) {
                    System.out.print("Welcome to my program, enter the temperature in Celsius");
                    System.out.println(" and it'll be converted into Kelvin and Fahrenheit!");
                    final String CelsiusSTR = in.nextLine();
                    try {
                        Float CelsiusFLT = Float.parseFloat(CelsiusSTR);
                        float KelvinFLT = convertTempKel(CelsiusFLT);
                        float FahrenheitFLT = convertTempFah(CelsiusFLT);
                        System.out.println(KelvinFLT + " " + FahrenheitFLT);
                    } catch (NumberFormatException error){
                        System.out.println("Bad input");
                    }
                    break;
                } else {
                    break;
                }
            } catch (NumberFormatException error) {
                System.out.println("Bad input, try again.");
            }
        }
    }
}
