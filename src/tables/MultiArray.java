package tables;

public class MultiArray {
    public static void main(String[] args) {
        char[][] t = {{'_', 'x', '_'},
                {'_', 'o', '_'},
                {'_', 'x', 'o'}};

        // petla iterujaca po wierszach
        for (int i = 0; i < t.length; i++) {
            // petla iteracja po kolumnach
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%3c", t[i][j]);
            }
            System.out.println(); //przeniesienie wiersza do nowej lini
        }

        // tablice wielowymiarowe nieregularne

        int[][] numbers = {
                               {1, 1, 1},
                               {2, 2, 2, 2, 2},
                               {3, 3, 3, 3, 3, 3, 3}
                          };

        System.out.println();
        for (int i = 0 ; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%3d", numbers[i][j]);
            }
            System.out.println(" ");
        }
        // 1. i = 0 | 0 < 3 -> true | i++
        // -> j = 0 | 0 < 3 -> true | j++  sout(1)
        // -> j = 1 | 0 < 3 -> true | j++  sout(1 1)
        // -> j = 2 | 0 < 3 -> true | j++  sout(1 1 1)
        // -> j = 3 | 0 < 3 -> false | j++  sout(end next \n)

        // 2. i = 1 | 1 < 3 -> true | i++
        // -> j = 0 | 0 < 5 -> true | j++  sout(2)
        // -> ...
        // -> j = 5 | 5 < 5 -> true | j++  sout(2 2 2 2 2)



    }

}

