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
        double salaryGross = input.nextDouble();
        String enter = input.nextLine();

        boolean correctGender = false;

        System.out.println("Podaj płeć: ");
        char gender = input.nextLine().toUpperCase().charAt(0);
        ///String gender = input.nextLine();
        //gender.toUpperCase();
        //if ((gender == 'K') || (gender == 'M')) {
        while (!((gender == 'K') || (gender == 'M'))) {
            System.out.println("Podano niepoprawne dane, wpisz ponownie");
            gender = input.nextLine().toUpperCase().charAt(0);
        }


        System.out.println("Podaj PESEL: ");
        long pesel = input.nextLong();
        enter = input.nextLine();

        System.out.printf("| %s| %s| %s| %f| %c| %d|\n",firstName, surname, state, salaryGross, gender, pesel);


       // Date dzisiaj = new Date();
       // System.out.println(dzisiaj);
    }
}
