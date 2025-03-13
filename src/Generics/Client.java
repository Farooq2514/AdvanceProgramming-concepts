package Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        oldVersion obj = new oldVersion();
       obj.setSecond(5);
       obj.setFirst(10);
       obj.setFirst("shaik");

       NewVersion<String  , String>  obj2 = new NewVersion();
       obj2.setFirst("shaik");
       obj2.setSecond("Umar");
       //Because of backward compatibility java still allows to use this type also but the better way is go in ubove one
       NewVersion rawtypes = new  NewVersion();
       //It automatically assumes both the types as object


        Dog d =  new Dog();
        d.setName("doggy");

        Dog d1 = new Dog();
        d1.setName("puppy");

        Cat c=  new Cat();
        c.setName("catty");

        Animal a = new Animal();
        a.setName("Something");

        Animal b = new Animal();
        b.setName("Big anima;");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(a);
        animals.add(b);
        animals.add(c);
        animals.add(d);
        Animal_Utility.printAnimals(animals);

        // This error of incompatiblity error becasuse all the animals cannot be dog
        List<Dog> dogs = new ArrayList<>();
        dogs.add(d);
        dogs.add(d1);
        //After doing the function generic here so now the error here
        Animal_Utility.printAnimals(dogs);

    }
}
