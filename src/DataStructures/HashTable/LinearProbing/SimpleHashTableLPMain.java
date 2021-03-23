package DataStructures.HashTable.LinearProbing;

import DataStructures.ArrayList.Employee;

public class SimpleHashTableLPMain {

    public static void main(String... args){

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);
        Employee billEnd = new Employee("Bill","End",78);

        SimpleHashTableLP ht = new SimpleHashTableLP();

        ht.put("Nowak", janNowak);
        ht.put("Woff", maciejWoff);
        ht.put("Tilson",mikeTilson);
        ht.put("Smith", johnSmith);

        ht.printHashTable();

        System.out.println("\nRetrieve key Woff :" +ht.get("Woff"));

        System.out.println("Retrieve key Smith :" +ht.get("Smith"));

        System.out.println("\nRemoving items :");
        ht.remove("Tilson");
        ht.remove("Smith");
        ht.printHashTable();
    }
}
