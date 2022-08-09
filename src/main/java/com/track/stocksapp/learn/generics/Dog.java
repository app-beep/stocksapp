package com.track.stocksapp.learn.generics;


import lombok.ToString;

@ToString
public class Dog implements  Animal {
    private   String name;
    public Dog ( String name)
    {
        this.name =  name;
    }


}
