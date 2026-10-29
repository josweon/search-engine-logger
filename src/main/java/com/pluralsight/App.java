package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {
    static DateTimeFormatter dateOnly = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    static DateTimeFormatter timeOnly = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void main(String[] args) {
        // TODO: static?
        String input;
        Scanner scanner = new Scanner(System.in);

    try {
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/logs.txt"));
        launchApp(bufWriter);

        do {
            System.out.print("Enter a search term (X or x to exit): ");
            input = scanner.nextLine().trim();

            if (!input.equalsIgnoreCase("X")) {
                logSearch(input, bufWriter);
            } else {
                closeApp(bufWriter);
            }

        } while (!input.equalsIgnoreCase("X"));

        bufWriter.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    }

    public static void launchApp(BufferedWriter bufWriter){
        LocalDateTime now = LocalDateTime.now();
        String writeString = String.format("%s %s launch%n", now.format(dateOnly), now.format(timeOnly));
        try {

            bufWriter.write(writeString);

        } catch (IOException e) {
            System.out.println("ERROR: Invalid IO Stream " + e.getMessage());
        }
    }

    public static void logSearch(String searchedQuery, BufferedWriter bufWriter){
        LocalDateTime now = LocalDateTime.now();
        String writeString = String.format("%s %s search : %s%n",
                now.format(dateOnly),
                now.format(timeOnly),
                searchedQuery);

        try {
            bufWriter.write(writeString);
        } catch (IOException e) {
            System.out.println("ERROR: Invalid IO Stream in logSearch " + e.getMessage());
        }
    }

    // TODO: add exiting the app
    public static void closeApp(BufferedWriter bufWriter){
        LocalDateTime now = LocalDateTime.now();
        String writeString = String.format("%s %s exit%n", now.format(dateOnly), now.format(timeOnly));

        try {
            bufWriter.write(writeString);
        } catch (IOException e) {
            System.out.println("ERROR: Invalid IO Stream closeApp" + e.getMessage());
        }
    }
}
