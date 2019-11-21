package accesSpecifiers;

import accesSpecifiers.animal.Animal;
import accesSpecifiers.animal.mammal.Mammal;
import accesSpecifiers.animal.reptile.Reptile;

public class Main {
    public static void main(String[] args) {
  //? why?      Mammal mammal void main(String[] args) {
            Mammal mammal = new Mammal();
            mammal.setAge(10);
            System.out.println(mammal);

            Reptile reptile = new Reptile();
//            System.out.println(reptile.name); // protected nie jest widoczny poza pakietem reptile
//            System.out.println(reprile.getName());

            Animal animal = new Animal();
//            animal.speed; //private nie jest dostępny poza pakietami animal
//            animal.getSpeed();
        }
    
}
