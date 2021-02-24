package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CountryTest
{
    @Test
    void getCountryCity()
    {
        Main.DoublyLinkedList list = new Main.DoublyLinkedList();
        list.addNode();
        list.addNode();

        assertEquals("Australia",list.head.country.name);
        assertEquals("Perth", list.head.city.name);

        assertEquals("France",list.tail.country.name);
        assertEquals("Paris", list.tail.city.name);


    }

}