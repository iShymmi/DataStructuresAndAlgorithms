package DataStructures.LinkedList;

import DataStructures.ArrayList.Employee;

public class LinkedListMain {

    public static void main(String... args){

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        // this mehod puts new element in the front of the list
        // we could implement to put the element on the end of the list or
        // after specified element but it will cause the O(n) time complexity

        list.addToFront(janNowak);
        list.addToFront(maciejWoff);
        list.addToFront(johnSmith);
        list.addToFront(mikeTilson);

        list.printList();

        System.out.println("\n" +list.getSize());

        System.out.println(list.isEmpty());

        list.removeFromFront();

        System.out.println(list.getSize());
        list.printList();
    }
}
