package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateOnly = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeOnly = DateTimeFormatter.ofPattern("HH:mm:ss");


    try {
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/logs.txt"));

        System.out.print("Enter a search term (X or x to exit): ");
        String input = scanner.nextLine();

        // test time
        System.out.println(now.format(dateOnly));
        System.out.println(now.format(timeOnly));

    } catch (Exception e) {
        e.printStackTrace();
    }

    }

    public static String launchApp (){
        return "";
    }
}
