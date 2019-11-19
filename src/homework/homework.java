package homework;

import java.util.Date;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Podaj imię: ");
        String firstName = input.nextLine();
        System.out.println("Podaj nazwisko: ");
        String surname = input.nextLine();
        System.out.println("Podaj stanowisko: ");
        String state = input.nextLine();
        System.out.println("Podaj pensję brutto: ");
        double slaryGross = input.nextDouble();
        String enter = input.nextLine();
        System.out.println("Podaj płeć: ");
        System.out.println("Podaj PESEL: ");





        Date dzisiaj = new Date();
        System.out.println(dzisiaj);
    }
}
