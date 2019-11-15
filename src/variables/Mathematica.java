package variables;

import static java.lang.Math.pow;

public class Mathematica {
    public static void main(String[] args) {
        final double PI = Math.PI;
        //x^y
        int x = 5;
        int y = 2;
        int result = (int) pow(x, y);
        System.out.println(result);
        // pierwiastek 3 stopnia z 16
        System.out.println(pow(16, 1.0 / 3));

        int a = 5;
        int b = 8;

        //wynik działania jest typu składnika o najwyższej precyzji działania
        System.out.println(a * b);
        //konwersja rozszerzająca -> konwersja do wyższej precyzji
        System.out.println((double)a / b);
        double measure = 1.443;
        System.out.println((int)measure);

    }
}
