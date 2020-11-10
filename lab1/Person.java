package com.company;

class Info
{
    char[] name;
    int age;
    void displayInfo()
    {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}

public class Person
{
    public static void main(String[] args)
    {
        Info Eliot = new Info();
        Eliot.displayInfo();
    }
}