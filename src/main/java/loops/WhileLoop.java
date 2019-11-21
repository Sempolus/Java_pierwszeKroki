package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        boolean isFinished = false;
        while (isFinished != true) {
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
                    isFinished = true;
                    break;
                default:
                    System.out.println("Zły wybór");
                    break;  //-> nie musi być przy defaulcie

            }
        }
    }
}
