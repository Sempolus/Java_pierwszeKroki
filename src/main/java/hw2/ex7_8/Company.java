package hw2.ex7_8;


import java.time.LocalDate;
import java.util.ArrayList;


public class Company {
    private ArrayList<Employee> employess = new ArrayList<>();

    // dodawanie pracownika do listy
    // walidacja nr PESEL
    // len == 11
    // unique

    //    public Employee addEmploye(
    public String addEmploye(
            String name,
            String lastname,
            String PESEL,
            LocalDate birthDate,
            double salaryNet) {
        if (!isPESELUnique(PESEL)) {
            return "Istnieje taki PESEL w liście pracowników";
        } else if (PESEL.length() == 11) {// && isPESELUnique(PESEL)) {
            Employee e = new Employee(name, lastname, PESEL, LocalDate.now(), birthDate, salaryNet);
            employess.add(e);
            return e.toString();
        //} else if (!isPESELUnique(PESEL)) {
      //      return "Istnieje taki PESEL w liście pracowników";
        } else {
            return "BŁĘDNY PESEL";
        }
    }

    // metoda sprawdzająca czy PESEL podany w argumencie występuje w liście pracowników
    public boolean isPESELUnique(String PESEL) {
        for (Employee e : employess) {
            //sprawdzanie występowanie peselu
            if (e.getPESEL().equals(PESEL)) {
                return false;
            }
        }
        return true;
    }
}
