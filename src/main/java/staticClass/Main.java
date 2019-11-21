package staticClass;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("X", "X");
        System.out.println(user1.getLogin());

        //Odwołanie do składowej statycznej
        // 1. Odwołanie nie wymaga utorzenie obiektu
        // 2. Odwołujemy sie poprzedzajac składową klasy
        // 3. jest tylko jedna kopia składowej statycznej w ramach klasy

        User user1 = new User("U1", "U1");

        System.out.println(User.globalId);

        User user2 = new User("U2", "U2");

        User.incrementGlobalId();
        System.out.println(User.globalId);

        User user3 = new

        // user1.g
    }
}
