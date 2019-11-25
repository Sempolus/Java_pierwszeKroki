package hw2.ex7_8;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;


//dodatek lombokowy
@Data  //gettery & settery & toString
@AllArgsConstructor  // konstruktor z wszystkimi parametrami

public class Employee {
    private String name, lastname;
    private final String PESEL;
    private LocalDate emplDate = LocalDate.now();
    private LocalDate birthDate;
    private double salary;


}
