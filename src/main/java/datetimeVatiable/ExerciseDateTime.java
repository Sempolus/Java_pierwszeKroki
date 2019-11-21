package datetimeVatiable;

import java.time.LocalDate;

public class ExerciseDateTime {
    public static void main(String[] args) {
        // znajdź dzień tygodnia w którym sie urodziłeś
        LocalDate birthDate = LocalDate.of(1982, 5, 21);
        System.out.println(birthDate.getDayOfWeek().getValue());
        System.out.println(birthDate.getDayOfWeek());

        LocalDate temporal = birthDate;

        LocalDate actual = LocalDate.now();

        //znajdz ile razy w ten sam dzień tygodnia twoje urzodziny przypadały

        int counter = 0;

//        for (int i = birthDate.getYear(); i <= actual.getYear() ; i++);
//        if (birthDate.getDayOfWeek() == temporal.plusYears() ) {
//            counter++
//        }
        for (int i = 0; i <= actual.getYear() - birthDate.getYear(); i++) {
            if (birthDate.getDayOfWeek() == temporal.plusYears(i).getDayOfWeek()) {
                System.out.println(temporal.plusYears(i));
                counter++;
            }
        }

        System.out.println(counter);

    }
}
