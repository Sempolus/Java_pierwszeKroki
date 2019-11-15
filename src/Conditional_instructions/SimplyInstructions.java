package Conditional_instructions;

import java.util.Scanner;

public class SimplyInstructions {
    public static void main(String[] args) {
        int age = 55;

        if (age >= 0 && age <= 120) {
            System.out.println("CZŁOWIEK - sprawdzam dalej");
            if (age > 18) {
                System.out.println("CZŁOWIEK DOROSŁY");
            } else if (age == 18) {
                System.out.println("CZŁOWIEK 18 LAT");
            } else {
                System.out.println("CZŁOWIEK NIEPEŁNOLETNI");
            }
        } else {
            System.out.println("ROBOT");
        }

        // SPRADŹ CZY LICZBA PODANA PRZEZ UŻYTKOWNIKA JEST PARZYSTA
        // jeśli tak wypis parzysta
        // jeśli nie wypisz nieparzysta
        // jeśli zero wypis zero

        int yourNumber;

        System.out.println("Podaj liczbę do sprawdzenia: ");
        Scanner scanner = new Scanner(System.in);
        yourNumber = scanner.nextInt();
        scanner.close();

        if (yourNumber == 0) {
            System.out.println("Twoja liczba to zero");
        } else if (yourNumber % 2 == 0) {
            if (yourNumber < 0) {
                System.out.println("Twoja liczba jest ujemna parzysta");
            } else {
                System.out.println("Twoja liczba jest dodatnia parzysta");
            }
        } else {
            if (yourNumber < 0) {
                System.out.println("Twoja liczba jest ujemna nieparzysta");
            }
            else {
                System.out.println("Twoja liczba jest nieparzysta");
            }
        }


    }
}
