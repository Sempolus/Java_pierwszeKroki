package exercises;

import exercises.controller.AutoController;
import exercises.model.Engine;
import exercises.model.Fuel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AutoController ac = new AutoController();
        //dodanie trzech aut do zamówienia
        ac.addAuto("VW", "Passat", Engine.v2_0, Fuel.diesel, 126000.50);
        ac.addAuto("VW", "Golf", Engine.v1_9, Fuel.diesel, 90000);
        ac.addAuto("VW", "Tiguan", Engine.v3_0, Fuel.hybid, 249_500);

        System.out.println("Dodano: " + ac.addAuto("VW", "Tiguan", Engine.v1_5, Fuel.gasoline, 180_500));
        //wypisz listę aut
        ac.printAllAutos();
        System.out.println("===================================================================================================");
        System.out.println();

        //ac.printAllAutos_unused();

        //usunięcie auta o wskazanym numerze w tablicy (index -1)
        //System.out.println("Usunięto: " + ac.removeAutoById( 4));
        //System.out.println();
        //ac.printAllAutos();
        //System.out.println("===================================================================================================");

        //ac.findAutoById(2);

        ac.discountById(2, 15);
        System.out.println("Obniżka o 15% ");
        ac.printAllAutos();
        System.out.println("===================================================================================================");

        System.out.println("Podwyżka na wszystko! ");
        ac.changeAllAutosPrice(false, 25);
        ac.printAllAutos();
        System.out.println("===================================================================================================");


        // dodajemy GUI użytkownika
        Scanner scanner = new Scanner(System.in);
        int decision = ' ';
        // iterujemy dopoki nie wybrano Q
        while (decision != 'Q') {
            System.out.println("PANEL FABRYKI AUT");
            System.out.println("(Z) - zamów auto");
            System.out.println("(P) - pokaż listę zamówionych aut");
            System.out.println("(U) - usuń auto");
            System.out.println("(R) - daj rabat na auto");
            System.out.println("(C) - zmień cenę wszystkich aut");
            System.out.println("(Q) - wyjście");
            decision = scanner.nextLine().toUpperCase().charAt(0);
            switch (decision) {
                case 'Z':
                    break;
                case 'P':
                    ac.printAllAutos();
                    break;
                case 'U':
                    System.out.println("Wybierz numer auta które chcesz usunąć:");
                    ac.printAllAutos();
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Usunięto: " + ac.removeAutoById(id));
                    break;
                case 'R':
                    break;
                case 'C':
                    break;
                case 'Q':
                    System.out.println("Do zobaczenia!");
                    break;
                default:
                    System.out.println("Błędny wybór");
            }
        }
    }
}
