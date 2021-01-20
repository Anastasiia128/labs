package com.company;
import java.util.Scanner;

public class Input
{
    private int start;
    private int end;
    private int size;
    final private static Scanner input = new Scanner(System.in);
    /**
     * Inputs interval , length of Fibonacci sequence
     */
    public void input()
    {
        System.out.print("Enter interval: ");
        start = input.nextInt();
        end = input.nextInt();
        System.out.print("Enter length of Fibonacci sequence: ");
        size = input.nextInt();
    }
    /**
     * Get access to variables
     */
    public int getStart()
    {
        return start;
    }
    public int getEnd()
    {
        return end;
    }
    public int getFibSize()
    {
        return size;
    }
}