package com.pluralsight;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a search term (X or x to exit): ");
        String input = scanner.nextLine();
    }
}
