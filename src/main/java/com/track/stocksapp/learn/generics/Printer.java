package com.track.stocksapp.learn.generics;

public class Printer <T extends Animal>{

    private T toPrint;

    public Printer (T toPrint )
    {
        this.toPrint = toPrint;
    }
    public void print()
    {
        System.out.println(this.toPrint.getClass());
        System.out.println(this.toPrint);
    }
}
