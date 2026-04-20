package com.pluralsight;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

       boolean process = true;

            while (process) {
                try {
                    String[] quotes = new String[10];
                    quotes[0] = "\"Don't be sorry. Be better.\" Kratos";
                    quotes[1] = "\"What is a man? A miserable little pile of secrets.\"  Dracula";
                    quotes[2] = "\"Snake? Snake? SNAKE!\" Metal Gear Solid";
                    quotes[3] = "\"Do a barrel roll!\" Star Fox 64 Kratos";
                    quotes[4] = "\"Don't be sorry. Be better.\" Kratos";
                    quotes[5] = "\"You Have Died\" Dark Souls";
                    quotes[6] = "\"War…war never changes\" Fallout";
                    quotes[7] = "\"A man chooses; a slave obeys.\" Bioshock";
                    quotes[8] = "\"No Russian.\" Call of Duty: Modern Warfare 2";
                    quotes[9] = "\"What is a man but the sum of his memories? We are the stories we live,\n the tales we tell ourselves.\" Assassin’s Creed: Revelations";

                    System.out.println("Enter a number 1 - 10:");
                    int number = input.nextInt() - 1;
                    input.nextLine();
                    System.out.println(quotes[number]);

                } catch (Exception e) {
                    System.out.println("Something went wrong. Please try again.");
                }
            }
        }
}
