package com.company;
import org.w3c.dom.Node;
import java.util.Scanner;
import com.company.Country;

public class Main
{

    public static class DoublyLinkedList
    {
        public class Node
        {
            Country country = new Country();
            Country.City city = country.new City();

            Node next;
            Node prev;

        }
        Node head = null;
        Node tail = null;

        public void addNode()
        {
            Node newNode = new Node();
            if(head == null)
            {
                head = tail = newNode;
                head.prev = null;
                tail.next = null;
            }
            else
            {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
                tail.next = null;
            }
        }

        public void printNodes()
        {
            Node current = head;
            if(head == null)
            {
                System.out.println("Doubly linked list is empty");
                return;
            }
            System.out.println("Linked list is as follows: ");
            while(current != null)
            {
                System.out.println("Country is: " + current.country.name);
                System.out.println("City is: " + current.city.name);

                System.out.println();
                current = current.next;
            }
        }
    }




    public static void main(String[] args)
    {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode();
        list.addNode();
        list.addNode();
        list.addNode();
        list.printNodes();
    }
}
