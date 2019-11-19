package loops;

public class OmmitingInstructions {
    public static void main(String[] args) {
        // PROGRAM SYSZUKUJACY OKRESLONY ZNAK W NAPISIE
        // JESLI ZNALEZIONO - > WYPISZ POZYCJE TEGO ZNAKU
        // JESLI NIE ZNALEZIONO, WYPISZ STOSOWNY KOMENTARZ
        String sentence = "Ala ma kota a kot ma Ale";
        char charSearch = 'k';
        boolean isFound = false;
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println("Iteracja nr. " + i);
            if (sentence.charAt(i) != charSearch) {
                //pominięcie aktualnie wykonywanej iteracj i przejście do kolejnej
                continue;
            } else if (sentence.charAt(i) == charSearch) {
                System.out.printf("Znaleziono znak %c na indeksie %d\n", sentence.charAt(i), i);
                isFound = true;
                //instrukcja przerywająca działanie pętli
                break;
            }
            System.out.println("nic waznego");
        }
        if (isFound == true) {
            System.out.printf("Nie znaleziono znaku %c w tekscie %s\n", charSearch, sentence);
        }
    }
}

