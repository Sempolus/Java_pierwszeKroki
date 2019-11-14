package variables;

public class TypeString {
    public static void main(String[] args) {
        String text = "Dowolny napis i 1.1234";
        System.out.println("Tekst = "+ text);
        System.out.println("Pierwszy znak napisu: " + text.charAt(0));
        System.out.println("Dziesiaty znak napisu: " + text.charAt(10));
        System.out.println("Ostatni znak napisu: " + text.charAt(text.length() - 1));

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

    }
}
