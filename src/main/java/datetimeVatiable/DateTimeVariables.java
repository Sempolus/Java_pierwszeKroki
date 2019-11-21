package datetimeVatiable;

import java.time.*;

public class DateTimeVariables {
    public static void getTimeMethods() {
        //czas aktualny
        LocalTime actual = LocalTime.now();
        //czas dowolny
        LocalTime custom = LocalTime.of(10, 10, 10);

        System.out.print("Actual: ");
        System.out.println(actual);
        System.out.print("Custom: ");
        System.out.println(custom);

        LocalTime parsed = LocalTime.parse("12:34:18");
        System.out.print("Parsed: ");
        System.out.println(parsed);
        System.out.print("Extract from parsed: ");
        System.out.println(parsed.getHour() + ":" + parsed.getMinute());

        System.out.print("+1 GMT: ");
        System.out.println(actual.plusHours(1));

        if (actual.isAfter(custom)) {
            System.out.println("czas: " + actual + " jest później");
        } else {
            System.out.println("czas: " + custom + " jest później");
        }
        System.out.println("Porównanie czasów: ");
        Duration duration = Duration.between (custom, actual);
        System.out.println(duration);
    }

    public static void getDateMethods(){
        LocalDate actualDate = LocalDate.now();
        LocalDate customDate = LocalDate.of(2000,5,21);
        System.out.println(actualDate);
        System.out.println(customDate);

        //porównanie dat
        Period period =  Period.between(customDate, actualDate); // różnica arg2 - arg1
        System.out.println(period);
    }



    public static void getDateTimeMethods(){
        LocalDateTime actual = LocalDateTime.now();
        LocalDateTime custom = LocalDateTime.of(2000, 8,25, 15,40,00);

        System.out.println(actual);
        System.out.println(custom);


    }

    public static void main(String[] args) {
//        getTimeMethods();
//        getDateMethods();
        getDateTimeMethods();
    }
}
