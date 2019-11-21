package lombok;

//model java beans


import javax.annotation.processing.Generated;

//@ToString               // dodaje metodę toString()
//@Setter                 // dodaje settery dla wszystkich pól
//@Getter                 // dodaje gettery dla wszystkich pól
//@NoArgsConstructor      // dodaje konstruktor bez argumentów
@AllArgsConstructor     // dodaje konstruktor z wszystkimi polami klasowymi w argumrncie
@Data                   //dodaje gettery, settery i toString () do wszystkich pól klasowych

public class AnnotationsLombok {
    private String login;
    private String password;


}
