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

    public static float shapeTriangle(float TriBaseFLT, float TriHeightFLT) {
        Float TriAreaFLT = (float) (TriBaseFLT * TriHeightFLT) / 2;
        return TriAreaFLT;
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
                    System.out.println("Which program would you like to run? 1 = Temp calculator. 2 = Shape area calculator");
                    final String programPickSTR = in.nextLine();
                    try {
                        Integer programPickINT = Integer.parseInt(programPickSTR);
                        switch (programPickINT) {
                            case 1:
                                System.out.println("Program 1 play");
                                System.out.print("Welcome to my program, enter the temperature in Celsius");
                                System.out.println(" and it'll be converted into Kelvin and Fahrenheit!");
                                final String CelsiusSTR = in.nextLine();
                                try {
                                    Float CelsiusFLT = Float.parseFloat(CelsiusSTR);
                                    Float KelvinFLT = convertTempKel(CelsiusFLT);
                                    Float FahrenheitFLT = convertTempFah(CelsiusFLT);
                                    System.out.println(KelvinFLT + " " + FahrenheitFLT);
                                } catch (NumberFormatException error) {
                                    System.out.println("Bad input");
                                }
                                break;
                            case 2:
                                System.out.println("Program 2 play");
                                System.out.println("Welcome to my shape area calculator");
                                System.out.println("Enter which shape you would use to calculate");
                                System.out.println("1 = Triangle, 2 = trapezoid, 3 = pentagon");
                                final String shapePickSTR = in.nextLine();
                                try {
                                    final Integer shapePickInt = Integer.parseInt(shapePickSTR);
                                    switch (shapePickInt) {
                                        case 1:
                                            System.out.println("Enter the base of triangle");
                                            final String TriBaseSTR = in.nextLine();
                                            try {
                                                final Float TriBaseFLT = Float.parseFloat(TriBaseSTR);
                                                if (TriBaseFLT > 0) {
                                                    System.out.println("Enter the height of the triangle");
                                                    final String TriHeightSTR = in.nextLine();
                                                    try {
                                                        final Float TriHeightFLT = Float.parseFloat(TriHeightSTR);
                                                        if (TriHeightFLT > 0) {
                                                            //TriAreaFLT
                                                            Float TriAreaFLT = shapeTriangle(TriBaseFLT, TriHeightFLT);
                                                            System.out.println(TriAreaFLT);
                                                        }
                                                    } catch (NumberFormatException Error) {
                                                        System.out.println("Bad input base");
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println("Bad input");
                                                }
                                            } catch (NumberFormatException Error) {
                                                System.out.println("Bad input case 1 try catch");
                                            }
                                            break;
                                        case 2:
                                            System.out.println("Enter base A of trapezoid");
                                            final String TrapBaseASTR = in.nextLine();
                                            try {
                                                final Float TrapBaseAFT = Float.parseFloat(TrapBaseASTR);
                                                if (TrapBaseAFT > 0) {
                                                    System.out.println("Enter the height of the triangle");
                                                    final String TampBaseBST = in.nextLine();
                                                    try {
                                                        final Float TampBaseBFT = Float.parseFloat(TampBaseBST);
                                                        if (TampBaseBFT > 0) {
                                                            System.out.println("Enter the height of the tamp");
                                                            final String TampHeightSTR = in.nextLine();
                                                            try {
                                                                final Float TampHeightFLT = Float.parseFloat(TampHeightSTR);
                                                            } catch (NumberFormatException Error) {
                                                                System.out.println("Bad input height flt");
                                                            }
                                                        } else {
                                                            System.out.println("Bad input base B");
                                                        }
                                                    } catch (NumberFormatException Error) {
                                                        System.out.println("Bad input base A");
                                                        break;
                                                    }
                                                } else {
                                                    System.out.println("Bad input");
                                                }
                                            } catch (NumberFormatException Error) {
                                                System.out.println("Bad input Base A");
                                            }
                                            break;
                                        case 3:
                                            System.out.println("test 3");
                                            break;
                                        default:
                                            System.out.println("Bad case");
                                            break;
                                    }
                                } catch(NumberFormatException Error) {

                                }

                                break;
                            default:
                                System.out.println("Bad input case, ending program.");
                                break;
                        }
                    } catch (NumberFormatException Error) {
                        System.out.println("Invalid input, restarting start");
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
