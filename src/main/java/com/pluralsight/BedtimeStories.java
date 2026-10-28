
package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("BedtimeStories");
        System.out.println("1 - goldilocks");
        System.out.println("2 - hansel_and_gretel");
        System.out.println("3 - mary_had_a_little_lamb");
        System.out.print("Enter the number of the story you want to read: ");

        int choice = sc.nextInt();

        String filename = "";

        switch (choice) {
            case 1:
                filename = "goldilocks.txt";
                break;
            case 2:
                filename = "hansel_and_gretel.txt";
                break;
            case 3:
                filename = "mary_had_a_little_lamb.txt";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        filereader(filename);
    }

    public static void filereader(String filename) {

        try (BufferedReader br = new BufferedReader(
                new FileReader(filename))) {

            String line;
            int count = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(count + ". " + line);
                count++;
            }

        } catch (IOException e) {
            System.out.println("Could not find or read: " + filename);
            System.out.println("Check that the file is in your project folder.");
        }
    }
}
