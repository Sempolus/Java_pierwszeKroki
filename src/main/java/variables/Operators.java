package variables;

//CTRL + ALT + L --> autoformatowanie kodu

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        //
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--j);
        System.out.println(j);

        System.out.println(((j++)) * (--i + j--) + (++i));
        // 3 * (5 + 4) + 6

        //Sprawdź czy użytkownik jest pełnoletni
        // jeżeli jego wiek jet >= 18 to wypisz jestes pełnoletni
        // wprzeciwnym razie wypisz nie jesteś pełnoletni
        //int age = 44;

        int age;
        // Utworzenie obiektu Scanner pozwalającego na wprowadzanie wartości do konsoli -> System.in

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź swój wiek: ");
        age = scanner.nextInt();

        String yesMature = "jestes pełnoletni";
        String noMature = "nie jestes pełnoletni";
        String botProtection = "jesteś botem";

        //age = (age>=18) ? System.out.println(tak):System.out.println(nie);

        //String isMature = age >= 18 ? "jestes pełnoletni" : "nie jestes pełnoletni" ;

        String isMature; //= age >= 18 ? yesMature : noMature;

        //System.out.println("Twój wiek to: " + age + " - " + isMature);
        //System.out.printf("Twój wiek to: %d - %s\n", age, isMature);

        String isWho =  (age >= 0 && age <= 120) ? (isMature = age >= 18 ? yesMature : noMature): botProtection ;
        System.out.println("Twój wiek to: " + age + " - " + isWho);
    }
}
