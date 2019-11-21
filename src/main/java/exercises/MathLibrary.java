package exercises;

public class MathLibrary {
    // 1. zaimplementuj metode zwracającą średnia wartości typu double podanych w argumencie metody jak tablica
    public static double avg(double[] args) {

//        double[] tab = new double[5];
//        double sum = 0;
//
//        for (int i = 0 ; i < tab.length ; i++) {
//            sum = sum + tab[i];
//        }
//        double result = sum / tab.length;
//
//        return result;
        double sum = 0;
        for (double a : args) {
            sum += a; // sum = sum + a;
        }
        return sum / args.length;
    }

    // 2. zaimplementuj metodę potęgującą dwie liczby całkowite
    // Metoda zwraca wynik działania a przyjmuje jako argumenty kolejno podstawę i wykładnik potęgi
    public static long power(int x, int y) {
        long result = 1;
        for (int i = 0; i < y; i++) {
            result = result * x;
        }
        return result;
    }

    // 3. Silnia
    public static long factorial(int n) {
        long result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }


    // 4. n! - rekurencyjnie
    public static long fact_rec(int n) {

        // return (n > 1) ? n * fact_rec(n-1):1;  // skrócony zapis

        if (n > 1) {
           // return fact_rec(n) *= fact_rec(n-1);
            return n * fact_rec(n-1);
        }
        else return 1;
    }

    // 5. ciąg fibonacciego
    public static long fibonacci(int n){
        if (n==0) {
            return 0;
        } else if (n==1){
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci (n-2);
        }
    }

    //fibo na arrayach
    public static long fiboArray(int n) {
        int [] fibo = new int[n];
        fibo[0] = 0;
        fibo[1]=1;
        System.out.println(fibo[0] + " ");
        System.out.println(fibo[1] + " ");
        int fiboArray = 1;
        for (int i = 2; i <fibo.length; i++) {
            fibo[i] = fibo[i-1] + fibo [i-2];
            System.out.println(fibo[i] + " ");
            fiboArray += fibo[i];
        }
        System.out.println();
        return fiboArray;
    }


}
