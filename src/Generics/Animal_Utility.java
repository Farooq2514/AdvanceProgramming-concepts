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

   // ? we use this because we dont want to explicitly mention that the type it might be anything we can use directly which
    //might be anything it might be t or it might be V etcc "It is just like wild Card that anything can be used here "?" -- > Anything"
   public static  void printAnimal(List<? extends Animal> animals){
       for(Animal animal : animals){
           System.out.println(animal.getName());
       }
   }
}
