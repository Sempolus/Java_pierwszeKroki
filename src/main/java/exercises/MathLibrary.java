package exercises;

public class MathLibrary {
    // 1. zaimplementuj metode zwracającą średnia wartości typu double podanych w argumencie metody jak tablica
    public static double avg(double[] args){

        double[] avg = new double[5];
        double sum = 0;

        for (int i = 0 ; i < avg.length ; i++) {
            sum = sum + avg[i];
        }
        double result = sum / avg.length;

        return 0.0;
    }

    // 2. zaimplementuj metodę potęgującą dwie liczby całkowite
    // Metoda zwraca wynik działania a przyjmuje jako argumenty kolejno podstawę i wykładnik potęgi
    public static int power (int x, int y) {



        return 0;
    }
}
