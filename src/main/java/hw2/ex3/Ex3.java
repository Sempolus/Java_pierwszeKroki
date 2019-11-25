package hw2.ex3;

import java.time.Duration;
import java.time.LocalTime;

public class Ex3 {
    private String text;
    public Ex3 (String text){
        this.text = text;
    }

    public int getSize(){
        return text.length();
    }

    public int getSizeWithoutSpaces() {
        return text.length() - text.replaceAll(" ", "").length();
    }

    public int getSizeWithoutSpacesLoop(){
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == ' '){
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public static void main(String[] args) {
        //konstruktor
        Ex3 ex3 = new Ex3 ("Ala ma korta a kot ma Alę kakak k k k k j g f r t u o po l j gf fd d r d");
        LocalTime tStart;
        LocalTime tStop;

        System.out.println("Długość napisu: " + ex3.getSize());
         tStart = LocalTime.now();
        System.out.println("Ilość spacji: " + ex3.getSizeWithoutSpacesLoop());
         tStop = LocalTime.now();

        Duration dt = Duration.between(tStart,tStop);
        System.out.println(dt.getNano());

        tStart = LocalTime.now();
        System.out.println("Ilość spacji: " + ex3.getSizeWithoutSpaces());
        tStop = LocalTime.now();

        dt = Duration.between(tStart,tStop);
        System.out.println(dt.getNano());


    }
}
