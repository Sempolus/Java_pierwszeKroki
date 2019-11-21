package oop;

import java.util.Scanner;

//klasa główna - uruchomieniowa
public class Main {
    public static void main(String[] args) {
        // utworzenie obiektu.
        //najpierw nazwa klasy, potem nadajemy nazwę noweko obiektu user, i słowo kluczowe "new" tworzymy nowego
        User userOne = new User();

        // Nadanie pola klasowego
        userOne.name = "Michał";
        userOne.lastName = "Kruczkowski";
        userOne.activated = true;
        userOne.gender = 'M';
        userOne.salary_net = 10100;

        // wywołanie metody
        userOne.printUser();

        User userTwo = new User("Adam", "Kowalski", 'M' , false, 6000);
        userTwo.printUser();

        User userThree = new User ("Anna","Nowak",'K',true,3000);
        userThree.printUser();

        userOne.salary_net= 9500.50;

        System.out.println("=================");
        userOne.printUser();
        userTwo.printUser();
        userThree.printUser();

        System.out.println("=================");
        userThree.holidayBonus();
        userThree.printUser();

        System.out.println("=================");

        double salaryGross = userOne.calculateSalaryGross();

        System.out.println("User One Salary Gross = "+ salaryGross);
        System.out.println("User Two Calculated salary gross:  = "+ userTwo.calculateSalaryGross());

        System.out.println("=================================");
        System.out.println(userThree.modifyUserParameters(15000,false));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź dane");
        System.out.println("Imię: ");
        String name = scanner.nextLine();
        System.out.println("Nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Płeć: ");
        char gender = scanner.nextLine().charAt(0);
        System.out.println("Pensja: ");
        double salary_net = scanner.nextDouble();
        //System.out.println("imię: ");
        User userFour = new User(name, lastName, gender,true , salary_net);
        userFour.printUser();

        System.out.println("=================================");
        userFour.holidayBonus();
        userFour.printUser();
    }
}
