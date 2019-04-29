package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class WeatherReport {

    // Variable Declaration
    Scanner scanner = new Scanner(System.in);                   //
    int over;                                                   //
    int under;                                                  //
    String town;                                                //
    String land;                                                //
    Date day = new Date();                                      //

    public void forecast() throws IOException{

        // take in user input
        System.out.println("Welcome to the Clever Weather Reporter!");
        System.out.println(" My name is Sunny Skyz and I will be keeping track the current weather forecast for your location.");
        System.out.println("Please provide me with the following information: ");
        System.out.println("");

        System.out.print("Please enter in your city: ");
        town = scanner.nextLine();

        System.out.print("Please enter in your state: ");
        land = scanner.nextLine();

        System.out.print("Please enter in today's High: ");
        over = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter today's Low: ");
        under = Integer.parseInt(scanner.nextLine());

        Weather outlook = new Weather(over,under,town,land);

        // Prints out user entered information
        System.out.println(outlook);
        System.out.println("This is Sunny Skyz and thank you for using the Clever Weather Reporter! You have a very Sunny Day!");

        createOutputFile(over,under,town,land,day);
    }

    private void createOutputFile(int over, int under, String town, String land, Date day) throws IOException {

        Weather outlook = new Weather(over,under,town,land);

        // Print out user input to a file
        FileWriter writer = new FileWriter(  this.town + ", " + this.land + ".txt");   // creates a FileWriter Object to create a new file to write to
        BufferedWriter buffer = new BufferedWriter(writer);                          // writes text to a file

        buffer.write(String.valueOf(this.day));
        buffer.newLine();

        buffer.write("Welcome to the Clever Weather Reporter!");
        buffer.newLine();

        buffer.write("My name is Sunny Skyz, weather report and here are the Current Weather Conditions in your area:");
        buffer.newLine();

        buffer.write(String.valueOf(outlook));

        buffer.newLine();
        buffer.flush();
        buffer.close();

    }
}
