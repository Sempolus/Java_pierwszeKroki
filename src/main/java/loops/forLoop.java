package loops;

public class forLoop {
    public static void main(String[] args) {
        String sentence = "Ala ma kota.";
        //Ala ma kota
        //012345678910
        // wypisz w pętli wszystkie znaki napisu pojedyńczo
        for (int i = 0; i <= sentence.length() - 1; i++) {
            if (sentence.charAt(i) != ' ') {
                System.out.printf("indeks: %d znak %c\n", i, sentence.charAt(i));
            }
        }
        // tablica - zmienna przechowująca zestaw wartości uporządkowanych po indeksach
        //index 0 -> 2
        //index 1 -> 4
        //...
        //index 5 ->12
        int numbers[] = {2, 4, 6, 8, 10, 12};

        // for ( : ) {  -> po : sekwencja (kolekcja wartości)
        //(typ pojedyńczej wartosci nazwa podreczna : kolekcja wartosci)
        int index = 0;
        for (int number : numbers) {
            System.out.printf("indeks %d wartość %d\n", index, number);
            index++;
        }


        char letters[] = {'a', 'b', 'c', 'd', 'e', 'f'};

        // for ( : ) {  -> po : sekwencja (kolekcja wartości)
        //(typ pojedyńczej wartosci nazwa podreczna : kolekcja wartosci)
        index = 0;
        for (int number : letters) {
            System.out.printf("indeks %d wartość %d\n", index, number);
            index++;
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) continue;
            System.out.println(i);
        }
    }
}
