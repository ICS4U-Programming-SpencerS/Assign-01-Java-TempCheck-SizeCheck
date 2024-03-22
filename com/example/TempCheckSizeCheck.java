//package com.example;

import java.util.Scanner;

/**
 * Assignment 1 Java 2 programs
 *
 * @author Spencer Scarlett
 * @version 1.0
 * @since 2024-03-20
 */

// TempCheckSizeCheck class
public final class TempCheckSizeCheck {

    /** Private constructor to prevent instantiation. */
    private TempCheckSizeCheck() {
        throw new UnsupportedOperationException("Cannot instantiate");
    }

    /** function that converts celsius to kelvin */
    public static float convertTempKel(final float CelsiusFLT) {
        final float KelvinFLT = (float) (CelsiusFLT + 273.15);
        return KelvinFLT;
    }

    /** function that converts celsius to fahrenheit */
    public static float convertTempFah(final float CelsiusFLT) {
        // Fahrenheit calculation
        final float FahrenheitFLT = (float) ((CelsiusFLT * 1.8) + 32);
        return FahrenheitFLT;
    }

    /** function that calculates the area of a triangle with inputs from main */
    public static float shapeTriangle(float TriBaseFLT, float TriHeightFLT) {
        float TriAreaFLT = (float) (TriBaseFLT * TriHeightFLT) / 2;
        float roundTriArea = (float) (Math.round(TriAreaFLT * 100.0) / 100.0);
        return roundTriArea;
    }

    /** function that calculates the area of a trapezoid with inputs from main */
    public static float shapeTrapezoid(float TrapBaseAFlt, float TrapBaseBFlt, float TampHeightFlt) {
        float TrapAreaFLT = (float) ((TrapBaseAFlt + TrapBaseBFlt) / 2) * 5;
        float roundTrapArea = (float) (Math.round(TrapAreaFLT * 100.0) / 100.0);
        return roundTrapArea;
    }

    /** function that calculates the area of a pentagon with inputs from main */
    public static float shapePentagon(float sideLengthFLT) {
        float PentAreaFLT = (float) (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(sideLengthFLT, 2));
        float roundedArea = (float) (Math.round(PentAreaFLT * 100.0) / 100.0);
        return roundedArea;
    }

    /**
     * This is the main method.
     *
     * @param args Unused
     */
    public static void main(final String[] args) {
        // scanner prep
        final Scanner in = new Scanner(System.in);

        // for the loop setup
        boolean programState = true;

        // loop for our program
        while (programState) {

            // start program y/s question
            System.out.println("Enter y to start, anything else to quit");
            String game = in.nextLine();
            if (game.equalsIgnoreCase("y")) {

                // select program choice
                System.out.println("Which program would you like to run? 1 = Temp calculator. 2 = Shape area calculator");
                final String programPickSTR = in.nextLine();

                // casting choice
                try {
                    Integer programPickINT = Integer.parseInt(programPickSTR);

                    // case 1 is for temperature
                    switch (programPickINT) {
                        case 1:
                            // opening
                            System.out.println("Welcome to my temperature converter.");
                            System.out.print("Enter the temperature in °C");
                            System.out.println(" and it'll be converted into K and °F!");

                            // casting
                            final String CelsiusSTR = in.nextLine();
                            try {
                                Float CelsiusFLT = Float.parseFloat(CelsiusSTR);

                                // for absolute zero
                                if (CelsiusFLT <= -273.15) {
                                    System.out.println("Input can't be -273.15 °C (absolute zero)");
                                } else {

                                    // calls for functions
                                    Float KelvinFLT = convertTempKel(CelsiusFLT);
                                    Float FahrenheitFLT = convertTempFah(CelsiusFLT);

                                    // output
                                    System.out.println(
                                            CelsiusFLT + "°C would be " + KelvinFLT + "K and " + FahrenheitFLT + "°F");
                                }

                                // bad inputs
                            } catch (NumberFormatException error) {
                                System.out.println("Invalid temperature inputted, value must be a number.");
                            }
                            // end cases
                            break;

                        // case 2 for shape area
                        case 2:

                            // opening
                            System.out.println("Welcome to my shape area calculator");
                            System.out.println("Enter which shape you would use to calculate");

                            // program selection
                            System.out.println("1 = triangle, 2 = trapezoid, 3 = pentagon");

                            // casting
                            final String shapePickSTR = in.nextLine();
                            try {
                                final Integer shapePickInt = Integer.parseInt(shapePickSTR);

                                // cases
                                switch (shapePickInt) {
                                    case 1:

                                        // lots of try catches but this code gets inputs and
                                        // checks if it's valued number (eg above 0, not str, etc)
                                        System.out.println("Enter the base of triangle(in cm)");
                                        final String TriBaseSTR = in.nextLine();
                                        try {
                                            final Float TriBaseFLT = Float.parseFloat(TriBaseSTR);
                                            if (TriBaseFLT > 0) {
                                                System.out.println("Enter the height of the triangle(in cm)");
                                                final String TriHeightSTR = in.nextLine();
                                                try {
                                                    final Float TriHeightFLT = Float.parseFloat(TriHeightSTR);
                                                    if (TriHeightFLT > 0) {

                                                        // function call
                                                        Float roundTriArea = shapeTriangle(TriBaseFLT, TriHeightFLT);

                                                        // output messages
                                                        System.out.print(
                                                                "The area of a triangle with a base of " + TriBaseFLT);
                                                        System.out
                                                                .print("cm and a height of " + TriHeightSTR + "cm is ");
                                                        System.out.println(roundTriArea + "cm");
                                                    } else {
                                                        System.out.println("Height must be greater than 0!");
                                                    }
                                                } catch (NumberFormatException Error) {
                                                    System.out.println("Invalid height inputted, value must be > 0");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("Base must be greater than 0!");
                                            }
                                        } catch (NumberFormatException Error) {
                                            System.out.println("Invalid base inputted, value must be > 0");
                                        }
                                        // break out of switch case
                                        break;

                                    // case for trapezoid
                                    case 2:
                                        // opening inputs, with try catches, valued if > 0 and number
                                        System.out.println("Enter base A of the trapezoid(cm)");
                                        final String TrapBaseAStr = in.nextLine();
                                        try {
                                            final Float TrapBaseAFlt = Float.parseFloat(TrapBaseAStr);
                                            if (TrapBaseAFlt > 0) {
                                                System.out.println("Enter base B of the trapezoid(cm)");
                                                final String TrapBaseBStr = in.nextLine();
                                                try {
                                                    final Float TrapBaseBFlt = Float.parseFloat(TrapBaseBStr);
                                                    if (TrapBaseBFlt > 0) {
                                                        System.out.println("Enter the height of the trapezoid(cm)");
                                                        final String TampHeightStr = in.nextLine();
                                                        try {
                                                            final Float TampHeightFlt = Float.parseFloat(TampHeightStr);
                                                            if (TampHeightFlt > 0) {

                                                                // calls function
                                                                Float roundTrapArea = shapeTrapezoid(TrapBaseAFlt,
                                                                        TrapBaseBFlt, TampHeightFlt);

                                                                // output message
                                                                System.out.print("A trapezoid with the base of "
                                                                        + TrapBaseAFlt + "cm and ");
                                                                System.out.print(TrapBaseBFlt + "cm with a height of "
                                                                        + TampHeightFlt);
                                                                System.out.println("cm will have an area of "
                                                                        + roundTrapArea + "cm");

                                                                // else statements or catches for bad input
                                                            } else {
                                                                System.out
                                                                        .println("Invalid height, height must be > 0");
                                                            }

                                                        } catch (NumberFormatException Error) {
                                                            System.out.println("Height needs to greater than 0!");
                                                        }
                                                    } else {
                                                        System.out.println("Base B must be greater than 0");
                                                    }
                                                } catch (NumberFormatException Error) {
                                                    System.out.println("Base B needs to be greater than 0!");
                                                    break;
                                                }
                                            } else {
                                                System.out.println("Base A must be greater than 0");
                                            }
                                        } catch (NumberFormatException Error) {
                                            System.out.println("Base A needs to be greater than 0!");
                                        }
                                        // end case 2
                                        break;

                                    // for pentagon inputs and output case
                                    case 3:

                                        // same idea, more inputs, more try catches, more if above 0 statements
                                        System.out.println("Enter the side length(cm)");
                                        final String sideLengthSTR = in.nextLine();
                                        try {
                                            final float sideLengthFLT = Float.parseFloat(sideLengthSTR);
                                            if (sideLengthFLT > 0) {

                                                // calls function and output 
                                                Float roundedArea = shapePentagon(sideLengthFLT);
                                                System.out.println("A pentagon with a side length of " + sideLengthFLT
                                                        + "cm will have an area of " + roundedArea + "cm");
                                            }
                                        } catch (NumberFormatException Error) {
                                            System.out.println("Side length must be greater than 0!");
                                        }
                                        // break out of switch cases
                                        break;

                                    // unused but default case
                                    default:
                                        System.out.println();
                                        break;
                                }

                                // for bad shape inputs
                            } catch (NumberFormatException Error) {
                                System.out.println("Invalid shape option selected.");
                            }

                            // this break shape input
                            break;

                        // unused default case, for program selection
                        default:
                            System.out.println();
                            break;
                    }

                    // for bad program selection
                } catch (NumberFormatException Error) {
                    System.out.println("Invalid program option!");
                }

                // this part is for restarting your code, only shows at the end of the program or if bad inputs
                System.out.println("Press enter to restart or Q to quit");
                String restart = in.nextLine();

                // q = quit anything else is restart
                if (restart.equalsIgnoreCase("q")) {
                    programState = false;
                }
            } else {
                // break for anything else
                break;
            }
        }
        // Closing the scanner
        in.close();
    }
}
