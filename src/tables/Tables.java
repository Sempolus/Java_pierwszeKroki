package tables;

import java.util.Arrays;
import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklaracja - założenie pustej tablicy
        String[] names = new String[5];

        // przypisanie wartrości
        for (int i = 0; i < 5; i++) {
            System.out.println("Wprowadz imie: ");
            names[i] = scanner.nextLine();
        }
//        for (String name : names) {
//            System.out.println(name);
//        }

//        names[0] = "Ala";
//        names[1] = "Ola";
//        names[2] = "Ada";
//        names[3] = "Anna";
//        names[4] = "Anka";


        //

       // Arrays.stream(names).forEach(name -> System.out.println(name));
        Arrays.stream(names).forEach(System.out::println);
    }
}
