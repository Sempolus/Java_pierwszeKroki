package exercises.controller;

//AutoController - klasa implementująca logike biznesową aplikacji
// 1. Zawiera listę aut.
// 2. Implementuję metode za pomocą której można dodać auto do listy

import exercises.model.Auto;
import exercises.model.Engine;
import exercises.model.Fuel;

import java.util.ArrayList;
//import java.util.List;

public class AutoController {
    //    private Auto[] autos = new Auto[100]; // -> deklaracja pustej tablicy aut o długości 100
    //   private List<Auto> autos = new List<>(); - polimorfizm i korzystanie z klasy nadrzednej
    private ArrayList<Auto> autos = new ArrayList<>();

    //    public Auto addAuto(String brand, String model, Engine engineType, Fuel fuelType, double price){
//    //ponbiżej to samo ale ładniej przejrzyście
    public Auto addAuto(String brand,
                        String model,
                        Engine engineType,
                        Fuel fuelType,
                        double price) {
        //utworzenie obiektu klasy auto
        Auto auto = new Auto(brand, model, engineType, fuelType, price);
        //zapis do listy aut
        autos.add(auto);
        return auto;
    }

    public void printAllAutos_unused() {
        //lista  wykorzystujemy for each
        for (Auto auto : autos) {
            System.out.println(auto);
        }
    }

    public void printAllAutos() {
        for (int i = 0; i < autos.size(); i++) {
            System.out.printf("| %3d | %15s | %15s | %15s | %15s | %15.2fzł |\n",
                    (i + 1), autos.get(i).getBrand(), autos.get(i).getModel(), autos.get(i).getEngineType(),
                    autos.get(i).getFuelType(), autos.get(i).getPrice());

        }
    }

    public Auto removeAutoById(int id) {
        return autos.remove(id - 1);
    }

    public Auto findAutoById(int Id) {
        return autos.get(Id - 1);
    }

    public Auto discountById(int Id, double discountPercent) {
        Auto discountingAuto = findAutoById(Id - 1);
        discountingAuto.setPrice(discountingAuto.getPrice() * (1 - discountPercent / 100));
 //       autos.get(Id-1).setPrice(autos.get(Id-1).getPrice() * (100 - discountPercent) / 100);
        return discountingAuto;
    }

    public void changeAllAutosPrice(boolean isDiscounted, int discountPercent) {
        for (int i = 0; i < autos.size(); i++) {

            if (isDiscounted) {
                autos.get(i).setPrice(autos.get(i).getPrice() * (100 - discountPercent) / 100);
            } else {
                autos.get(i).setPrice(autos.get(i).getPrice() * (100 - discountPercent) / 100);
            }
        }
    }
}
