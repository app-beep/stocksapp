package com.track.stocksapp.learn.generics;

import lombok.ToString;

@ToString
public class Cat implements  Animal {
    private   String name;
    public Cat ( String name)
    {
        this.name =  name;
    }

}
