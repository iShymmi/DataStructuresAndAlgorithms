package DataStructures.LinkedList.DoublyLinkedList;

import DataStructures.ArrayList.Employee;

public class LinkedListMain {

    public static void main(String... args){

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janNowak);
        list.addToFront(maciejWoff);
        list.addToFront(johnSmith);
        list.addToFront(mikeTilson);

        list.printList();
        System.out.println(list.getSize());

        Employee billEnd = new Employee("Bill","End", 78);

        list.addToEnd(billEnd);
        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();
        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.printList();
        System.out.println(list.getSize());

        list.addBefore(billEnd,janNowak);
        list.printList();
        System.out.println(list.getSize());

        list.addBefore(new Employee("Someone","Else", 123),johnSmith);
        list.printList();
        System.out.println(list.getSize());
    }
}
