package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    try {
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/logs.txt"))

        System.out.print("Enter a search term (X or x to exit): ");
        String input = scanner.nextLine();
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

    public static String launchApp (){
        return "";
    }
}
