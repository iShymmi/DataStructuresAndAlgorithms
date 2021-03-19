package DataStructures.LinkedList.JDKLinkedLIst;

import DataStructures.ArrayList.Employee;

import java.util.LinkedList;

// JDK LinkedList is Doubly-Linked List implementation
// LinkedList is not synchronized
public class JDKLinkedList {

    public static void main(String... args){

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);

        // LinkedList uses generics so we can use it on any type
        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janNowak);
        list.addFirst(maciejWoff);
        list.addFirst(johnSmith);
        list.addFirst(mikeTilson);

        list.forEach(System.out::println);


        System.out.println("\nAdd to end");
        Employee billEnd = new Employee("Bill","End",78);

        // add method default add item to the end of the
        // addLast() does same job
        list.add(billEnd);
        list.forEach(System.out::println);


        //remove() method removes item from front of the list!
        System.out.println("\nRemove first");
        list.removeFirst();
        list.forEach(System.out::println);

        System.out.println("\nRemove Last");
        list.removeLast();
        list.forEach(System.out::println);
    }
}
