package variables;

import java.util.Locale;
import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner.useLocale(Locale.US)
        //wprowadzam liczbę
        System.out.println("Wprowadź liczbę całkowitą: ");
        int number = scanner.nextInt(); //ENTER -> \n
        System.out.println("Wprowadź liczbę zmienno przecinkową: ");
        double number2 = scanner.nextInt(); //ENTER -> \n
        // aby skonsumowac enter wykonujemy funkcje next line
        String enter = scanner.nextLine();
        //wprowadź napis
        System.out.println("Wprowadź napis: ");
        String text = scanner.nextLine();
        System.out.printf("Wprowadziłeś: %d i %s\n", number, text);
        System.out.printf("Skonsumowano: \n", enter);
        //zamknięcie połączenia
        scanner.close();
    }
}
