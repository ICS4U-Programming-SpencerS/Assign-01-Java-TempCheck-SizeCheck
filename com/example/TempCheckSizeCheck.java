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

    public static float shapeTrapezoid(float TrapBaseAFlt, float TrapBaseBFlt, float TampHeightFlt) {
        Float TrapAreaFLT = (float) ((TrapBaseAFlt + TrapBaseBFlt) / 2) * 5;
        return TrapAreaFLT;
    }

    public static float shapePentagon(float sideLengthFLT) {
        Float PentAreaFLT = (float) (0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(sideLengthFLT, 2));
        return PentAreaFLT;
    }

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        boolean programState = true;
        while (programState) {
            System.out.println("Enter y to start, anything else to quit");
            String game = in.nextLine();
            if (game.equalsIgnoreCase("y")) {
                System.out.println("Which program would you like to run? 1 = Temp calculator. 2 = Shape area calculator");
                final String programPickSTR = in.nextLine();
                try {
                    Integer programPickINT = Integer.parseInt(programPickSTR);
                    switch (programPickINT) {
                        case 1:
                            System.out.println("Welcome to my temperature converter.");
                            System.out.print("Enter the temperature in °C");
                            System.out.println(" and it'll be converted into K and °F!");
                            final String CelsiusSTR = in.nextLine();
                            try {
                                Float CelsiusFLT = Float.parseFloat(CelsiusSTR);
                                if (CelsiusFLT <= -273.15) {
                                    System.out.println("Input can't be -273.15 °C (absolute zero)");
                                } else {
                                    Float KelvinFLT = convertTempKel(CelsiusFLT);
                                    Float FahrenheitFLT = convertTempFah(CelsiusFLT);
                                    System.out.println(
                                            CelsiusFLT + "°C would be " + KelvinFLT + "K and " + FahrenheitFLT + "°F");
                                }
                            } catch (NumberFormatException error) {
                                System.out.println("Invalid temperature inputted, value must be a number.");
                            }
                            break;
                        case 2:
                            System.out.println("Welcome to my shape area calculator");
                            System.out.println("Enter which shape you would use to calculate");
                            System.out.println("1 = triangle, 2 = trapezoid, 3 = pentagon");
                            final String shapePickSTR = in.nextLine();
                            try {
                                final Integer shapePickInt = Integer.parseInt(shapePickSTR);
                                switch (shapePickInt) {
                                    case 1:
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
                                                        //TriAreaFLT
                                                        Float TriAreaFLT = shapeTriangle(TriBaseFLT, TriHeightFLT);
                                                        System.out.print(
                                                                "The area of a triangle with a base of " + TriBaseFLT);
                                                        System.out
                                                                .print("cm and a height of " + TriHeightSTR + "cm is ");
                                                        System.out.println(TriAreaFLT+ "cm");
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
                                        break;
                                    case 2:
                                        System.out.println("Enter base A of the trapezoid");
                                        final String TrapBaseAStr = in.nextLine();
                                        try {
                                            final Float TrapBaseAFlt = Float.parseFloat(TrapBaseAStr);
                                            if (TrapBaseAFlt > 0) {
                                                System.out.println("Enter base B of the trapezoid");
                                                final String TrapBaseBStr = in.nextLine();
                                                try {
                                                    final Float TrapBaseBFlt = Float.parseFloat(TrapBaseBStr);
                                                    if (TrapBaseBFlt > 0) {
                                                        System.out.println("Enter the height of the trapezoid");
                                                        final String TampHeightStr = in.nextLine();
                                                        try {
                                                            final Float TampHeightFlt = Float.parseFloat(TampHeightStr);
                                                            if (TampHeightFlt > 0) {
                                                                Float TrapAreaFLT = shapeTrapezoid(TrapBaseAFlt,
                                                                        TrapBaseBFlt, TampHeightFlt);
                                                                System.out.println(TrapAreaFLT);
                                                            } else {
                                                                System.out.println("Invalid height, height must be > 0");
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
                                        break;
                                    case 3:
                                        System.out.println("Enter the side length");
                                        final String sideLengthSTR = in.nextLine();
                                        try {
                                            final float sideLengthFLT = Float.parseFloat(sideLengthSTR);
                                            if (sideLengthFLT > 0) {
                                                Float PentAreaFLT = shapePentagon(sideLengthFLT);
                                                System.out.println(PentAreaFLT);
                                            }
                                        } catch (NumberFormatException Error) {
                                            System.out.println("Side length must be greater than 0!");
                                        }
                                        break;
                                    default:
                                        System.out.println("Side length needs to be greater than 0!");
                                        break;
                                }
                            } catch (NumberFormatException Error) {
                                System.out.println("Invalid shape option selected.");
                            }
                            break;
                        default:
                            System.out.println("Invalid shape case selected!");
                            break;
                    }
                } catch (NumberFormatException Error) {
                    System.out.println("Invalid program option!");
                }
                System.out.println("Press enter to restart or Q to quit");
                String restart = in.nextLine();
                if (restart.equalsIgnoreCase("q")) {
                    programState = false;
                }
            } else {
                break;
            }
        }
        // Closing the scanner
        in.close();
    }
}
