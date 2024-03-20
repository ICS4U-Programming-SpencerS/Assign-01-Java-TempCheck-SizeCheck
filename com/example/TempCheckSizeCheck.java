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

    public static float convertTemp(final float CelsiusFLT) {
        // Fahrenheit calculation
        final float FahrenheitFLT = (float) ((CelsiusFLT * 1.8) + 32);
        return FahrenheitFLT;
    }
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);

        System.out.println("Hello, this program accepts temperature in Celsius ");
        System.out.print("but then converts it to Kelvin and Fahrenheit!: ");
        final String CelsiusSTR = in.nextLine();

        try {
            final Float CelsiusFLT = Float.parseFloat(CelsiusSTR);
            if (CelsiusFLT < -273.15) {
                System.out.println("Inputted temperature can't go past -273.15 (absolute zero)");
            } else {
                float FahrenheitFLT = convertTemp(CelsiusFLT);
                System.out.println(FahrenheitFLT);
            }
        } catch(NumberFormatException error) {
            System.out.println("Invalid input detected, program ending.");
        }

    }
}
