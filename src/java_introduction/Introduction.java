package java_introduction;

//  "CTRL + /" --> komentarz jednowierszowy

/*
CTRL + SHIFT + / -- > komentarz blokowy
*/

// CTRL + SHIFT + F10  --> run project

public class Introduction {
    //metoda uruchumieniowa - automatycznie wywoływana jako pierwsza w trakcie uruchamiania projektu
//    psvm - skrót
    public static void main(String[] args) {
        // polecenie wypisujące wartości w argumencie na standardowym wyjściu
        System.out.println("Twój pierwszy program na kursie");
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

        // typy danych
        int myFirstNumber = 5235;
        System.out.println("myFirstNumber = " + myFirstNumber);

        //short myShortNumber = 500300;
        //System.out.println("myShortNumber = " + myShortNumber);

        System.out.println("dodawanie liczb: " + (1438 + myFirstNumber ));

        System.out.println("dzielenie liczb: " + (9438 / myFirstNumber));
        //System.out.printf("dzielenie liczb: %.2f", (9438 / myFirstNumber));

        System.out.println();

        double salaryNet = 9150.99;
        int taxVat = 23;

        System.out.println("Kwota netto: " + salaryNet + "zł");
        System.out.println("Kwota brtto: " + (salaryNet + salaryNet*taxVat/100));
        System.out.println("Kwota brtto: " + (salaryNet + salaryNet*taxVat/100.0));
        System.out.println("Kwota brtto: " + (salaryNet * (1+taxVat/100)));
        System.out.println("Kwota brtto: " + (salaryNet * (1+taxVat/100.0)));

        System.out.println();

        System.out.printf("Kwota brutto: %.2f zł",(salaryNet * (1+taxVat/100.0)));
        System.out.println();
        System.out.printf("%.2fzł netto to %.2fzł brutto", salaryNet, salaryNet * (1+taxVat/100.0));
        System.out.println();
        System.out.printf("Liczba %20.2f", salaryNet);  //%.20.2f - rezerwuje 20 znaków i do 2 dokładności

        System.out.println();

        char smallLetter = 'a';
        char bigLetter = 'A';
        char spaceChar = ' ';
        char dotChar = '.';

        System.out.println(smallLetter);
        System.out.println(smallLetter+10);
        System.out.println((char)(smallLetter+10));
        System.out.println((dotChar+0));

        System.out.printf("Wypisz ten znak z formatowaniem: %c", dotChar);
        System.out.println();
        System.out.printf(" Znak %c ma %d numer ASCII \n", dotChar, (int)dotChar);
        //System.out.println();
        System.out.printf("Wypisz ten znak z formatowaniem: %c\n", 46);

        boolean isActivated = true;
        System.out.println(isActivated);
        System.out.println(!isActivated);




    }
}
