package LamdaStreamandException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClient {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        Stream<Integer> stream = al.stream();
       List<Integer> list =  stream.filter((data) -> {return data % 2 != 0;}).collect(Collectors.toList());
        System.out.println(list);


        list =
                al.stream().filter(data ->{

            System.out.println("filter data "+data);
            return  data % 2 == 0;

        }).map(data -> {

            System.out.println("Mapping data "+data);
            return  data * data;

        }).collect(Collectors.toList());
        System.out.println(list);
        //-->stream just keep the data ready when it comes to terminal then it is going to execute the task
        //means just like holding the data by keeping all the functions ready when ever the terminal method comes and ask the data
        //then immediately it executes and get the data

      Optional<Integer> ansOptional =   al.stream().filter(data ->{

            System.out.println("filter data "+data);
            return  data % 2 == 0;

        }).map(data -> {

            System.out.println("Mapping data "+data);
            return  data * data;

        }).findFirst();
        System.out.println(ansOptional.get());

        //Task 2 :
        //Given list of integer use java streams and filter out the number > 10
        //Double each of the remaing numbers

        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(12);
        al2.add(2);
        al2.add(30);
        al2.add(40);
        al2.add(15);
        al2.add(16);
        Stream<Integer> stream2 = al2.stream();
       // ArrayList<Integer> list2 = new  ArrayList<>();
        List<Integer>list2 =
                al2.stream().filter(data ->data>10
                ).map(data ->2*data).sorted().collect(Collectors.toList());
        System.out.println(list2);
    }
}
//filter is Intermediate method --> in this original data is not changed or not able to get it
//collect is the terminal method --> in this the data we are getting here