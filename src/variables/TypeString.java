package variables;

import javax.sound.midi.Soundbank;

public class TypeString {
    public static void main(String[] args) {
        String text = "Dowolny napis i 1.1234";
        System.out.println("Tekst = "+ text);
        System.out.println("Pierwszy znak napisu: " + text.charAt(0));
        System.out.println("Dziesiaty znak napisu: " + text.charAt(10));
        System.out.println("Ostatni znak napisu: " + text.charAt(text.length() - 1));

        System.out.println("'D' znajduje sie na pozycji: " +text.indexOf('D'));
        System.out.println("'y' znajduje sie na pozycji: " +text.indexOf('y'));
        System.out.println("' ' znajduje sie na pozycji: " +text.indexOf(' '));
        System.out.println("'napis' znajduje sie na pozycji: " +text.indexOf("napis"));
        System.out.println("Długość napisu w zmiennej tekst: " + text.length());

        //jak wydobyć i zapisać w nowej zmiennej słowo napis ze zmiennej text
        String napis = text.substring(8,13);  //substring (beginInt, endInt-1)
        System.out.println(napis);

        String cite = "Być albo nie Być!";
        cite = cite.replaceAll("ć", "c");
        String updateCite = cite.replaceAll("B", "b");
        System.out.println(updateCite);
        System.out.println(cite);

        String name1 = "Ala1";
        String name2 = "Ala2";

        System.out.println(name1.equals(name2));
        System.out.println(name1.length() >= name2.length());

        String name = "Michał";
        //name.charAt(name.length()-1) = 'l'; typ string jest niezmienny
        name = name.replace ("ł","l");
        System.out.println("Po: " + name);
        // name + "abc"
        name = name + "abc";
        System.out.println("Po złączeniu name z abc: " + name);

        // Sprawdzanie czy napis jest palindromem
        String txt = "KAJAK";
        System.out.println(txt);
        //utworzyliśmy obiekt klasy StrigBuffer -> edytowalny STring
        StringBuffer editableText = new StringBuffer(txt);
        //odwrócenie liter w napisie
        editableText.reverse();
        // przypisanie odwróconego napisu do zmiennej String -> nieedytowalnej
        System.out.println(editableText);

        System.out.println("Czy napis jest palindromem: "+ txt.equals(editableText.toString()));

        //inny sposób
        for (int i = 0; i <= txt.length() - 1; i++) {
            if (txt.charAt(i) != txt.charAt(txt.length() - 1 - i)) {
                System.out.println("Nie jest palindromem");
            }
            System.out.println("index: " + i + " jest równy: " + (txt.length() - 1 - i));
        }

        String login = "MikiKru";
        System.out.println("małe litery: " + login.toLowerCase());
        System.out.println("Oryginał: " + login);

        System.out.println(login.equals("mikikru"));
        System.out.println(login.toUpperCase().equals("mikikru".toUpperCase()));

        System.out.println();

        String sentence = "Być albo nie być oto jest pytanie";
        // podziel zdanie na wyrazy
        //separator --> spacja
        String [] words = sentence.split(" ");
        System.out.println(words[0]);
        System.out.println(words[1]);
        System.out.println(words[2]);
        System.out.println(words[3]);
        System.out.println(words[4]);
        System.out.println(words[5]);
        System.out.println(words[6]);


    }
}
