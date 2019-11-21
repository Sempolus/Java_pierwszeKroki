package java_introduction;

import homework.*;
import JavaBeans.RGB;
import lombok.AnnotationsLombok;

public class Main {
    public static void main(String[] args) {
        AnnotationsLombok annotationsLombok = new AnnotationsLombok( "michał" , "123");
        //jest getter
        System.out.println(annotationsLombok.getLogin());
        //jest setter
        annotationsLombok.setLogin("XXX");
        // jest toString
        System.out.println(annotationsLombok);

        RGB color2 = new RGB(1,2,3);
        System.out.println(color2);

    }
}
