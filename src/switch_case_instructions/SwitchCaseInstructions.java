package switch_case_instructions;

import Conditional_instructions.Grade;

import java.util.Scanner;

public class SwitchCaseInstructions {
    public static void main(String[] args) {
        // CLI -> Command Line Interface
        Scanner charInput = new Scanner(System.in);
        System.out.println("Witaj w naszej aplikacji");
        System.out.println("(L) - logowanie");
        System.out.println("(R) - rejestracja");
        System.out.println("(Q) - wyjście");

        char decision = charInput.nextLine().charAt(0);

        // char decision = charInput.nextLine().toUpperCase().charAt(0); -> zmiana na duże znaki aby zamiast case mała duza litera

        switch (decision) {
            case 'l':
            case 'L':
                System.out.println("logowanie...");
                break;
            case 'r':
            case 'R':
                System.out.println("rejestracja");
                break;
            case 'q':
            case 'Q':
                System.out.println("wyjście");
                break;
            default:
                System.out.println("Zły wybór");
                break;  //-> nie musi być przy defaulcie

        }

        Grade grade = Grade.celujący;
        switch (grade) {
            case celujący:
                System.out.println("Swietnie! Jesteś najlepszy!");
                break;
            case bardzo_dobry:
            case dobry:
                System.out.println("Jest dobrze!");
                break;
            case dostateczny:
            case dopuszczający:
                System.out.println("Mogłobyc lepiej");
                break;
            case niedostateczny:
                System.out.println("Niezdałeś...");
        }
        charInput.close();
    }
}
