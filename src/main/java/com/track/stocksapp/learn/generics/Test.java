package com.track.stocksapp.learn.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main ( String ...s)
    {
        //testGenericClass();
       // testGenericMethods();
        testWildcard( );
    }

    private static  void testGenericClass()
    {
        /*
        Printer <Integer> printerInt = new Printer< >(1223333);
        printerInt.print();
        Printer <Double> printerDoc = new Printer< >(122.7777);
        printerDoc.print();
        */

        Printer <Dog> printerDog = new Printer< >(new Dog("Jimmy"));
        printerDog.print();

        Printer <Cat> printerCat = new Printer< >(new Cat("CathieCat"));
        printerCat.print();
    }
    private static  void testGenericMethods()
    {
        Test t = new Test();
        t.shout("Hello");
        t.shout(new Cat("Cathie"));
    }
    private static  void testWildcard( ) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat ("Cat1"));
        cats.add(new Cat ("Cat2"));
        cats.add(new Cat ("Cat3"));
        printList(cats);

        String[] numArray = {"one","two", "three", "four", "five"};
        List<String> numbers = Arrays.asList(numArray);
        //printList(numbers);
    }

    /**
     * Object is super class of Integer
     * List of Object is super class of List of Integer
     * @param myList
     */
    private static void printList( List<? extends Animal> myList)
    {
        for (Animal temp : myList)
            System.out.println(temp);
    }

    private <T>void shout( T shouter )
    {
        System.out.println( shouter.getClass());
        System.out.println( shouter);
    }
}
