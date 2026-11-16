package com.pluralsight.staticcling;

import java.util.Scanner;

public class Utils {
    private static Scanner myScanner = new Scanner(System.in);

    /*
    * Prompts the user for a floating-point number and validates numeric input before returning it
    * @param message prompt for the numeric input
    * @return the number the user enters as a double
    * */

    public static double promptForDouble(String message){

        boolean done = false;
        double result = 0;

        do{
            System.out.println(message);
            String input = myScanner.nextLine();

            try{
                result = Double.parseDouble(input);
                done = true;
            }catch (NumberFormatException nfe){
                System.out.println("Invalid number format, try again");
            }
        } while (!done);

        return result;
    }

    private Utils(){}
}
