package Generics;

import java.util.List;

public class Animal_Utility {
//    public static void printAnimals(List<Animal> animalList){
//        for(Animal animal : animalList){
//            System.out.println(animal);
//        }
//    }
   public static <T extends Animal> void printAnimals(List<T> animalList){
        for(T animal : animalList){
            System.out.println(animal);
        }
   }
}
