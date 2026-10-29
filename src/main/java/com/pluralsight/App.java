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
        Scanner scanner = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateOnly = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeOnly = DateTimeFormatter.ofPattern("HH:mm:ss");


    try {
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/logs.txt"));
        launchApp(bufWriter, now);

        System.out.print("Enter a search term (X or x to exit): ");
        String input = scanner.nextLine();

        // test time
        System.out.println(now.format(dateOnly));
        System.out.println(now.format(timeOnly));

    } catch (Exception e) {
        e.printStackTrace();
    }

    }

    public static void launchApp(BufferedWriter bufWriter, LocalDateTime now){
        String writeString = String.format("%s %s launch", now.format(dateOnly), now.format(timeOnly));
        try {

            bufWriter.write(writeString);
            bufWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR: Invalid IO stream " + e.getMessage());
        }
    }
}
