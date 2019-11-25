package hw2.ex7_8;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Company c = new Company();
        System.out.println("Info: " + c.addEmploye("Adam", "Kowalski", "12312312312", LocalDate.of(2000,4,3), 13300));
        System.out.println("Info: " + c.addEmploye("Jan", "Nowak", "12312312312", LocalDate.of(2001,4,3), 13300));
        System.out.println("Info: " + c.addEmploye("Anna", "Kowalska", "1231231231", LocalDate.of(2001,4,3), 13300));

    }
}
