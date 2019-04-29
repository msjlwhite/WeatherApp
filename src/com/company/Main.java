package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // calls class WeatherReport to run app
        WeatherReport report = new WeatherReport();
        report.forecast();

//        Weather outlook = new Weather(75,60,"Kansas City", "MO");

    }// end of main

}//end of Weather Class
