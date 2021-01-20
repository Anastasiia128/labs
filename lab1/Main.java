package com.company;

/**
 * @version 1.0
 * @author Borkivska Anastasiia
 */
public class Main
{
    public static void main(String[] args)
    {
        Input enter = new Input();
        enter.input();
        Output print = new Output(enter.getStart(),enter.getEnd());
        print.interval();
        print.pair();
        print.odd();
        Fibonacci row = new Fibonacci(enter.getFibSize());
        row.fibonacci(print.getLOdd(),print.getLPair());
        row.print();
    }
}



