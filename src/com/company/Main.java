package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    // variable declaration
//    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws IOException {
	// write your code here

        Scanner scanner = new Scanner(System.in);                   //
        int over;
        int under;
        String town; // = null;
        String land;// = null;
        Date day = new Date();


//        Weather outlook = new Weather(75,60,"Kansas City", "MO");


        // take in user input
        System.out.println("Welcome to the Clever Weather Reporter!");
        System.out.println(" My name is Sunny Skys and I will be keeping track the current weather forecast for your location.");
        System.out.println("Please provide me with the following information: ");
        System.out.println("");

        System.out.print("Please enter in today's High: ");
        over = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter today's Low: ");
        under = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter in your city: ");
        town = scanner.nextLine();

        System.out.print("Please enter in your state: ");
        land = scanner.nextLine();

        Weather outlook = new Weather(over,under,town,land);

        FileWriter writer = new FileWriter(  town + ", " + land + ".txt");   // creates a FileWriter Object to create a new file to write to
        BufferedWriter buffer = new BufferedWriter(writer);         // writes text to a file


        // Prints out user entered information
        System.out.println(outlook);
        System.out.println("This is Sunny Skyz and thank you for using the Clever Weather Reporter! You have a very Sunny Day!");

        // Print out user input to a file
        buffer.write(String.valueOf(day));
        buffer.newLine();

        buffer.write("Welcome to the Clever Weather Reporter!");
        buffer.newLine();

        buffer.write("My name is Sunny Skyz, weather report and here are the Current Weather Conditions in your area:");
        buffer.newLine();

        buffer.write(String.valueOf(outlook));

        buffer.newLine();

        buffer.flush();
        buffer.close();


    }// end of main

}//end of Weather Class
