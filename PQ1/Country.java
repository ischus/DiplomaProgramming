package com.company;
import java.util.Scanner;

public class Country
{
    String name;
    public Country()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Please enter country name");
        name = sc1.next();

    }

    public class City
    {
        String name;
        public City()
        {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Please enter city name");
            name = sc1.next();

        }
    }
}
