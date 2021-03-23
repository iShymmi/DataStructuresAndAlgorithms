package DataStructures.HashTable.SimpleHashTable;

import DataStructures.ArrayList.Employee;

public class SimpleHashTableMain {

    public static void main(String... args){

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);
        Employee billEnd = new Employee("Bill","End",78);

        SimpleHashTable ht = new SimpleHashTable();

        ht.put("Nowak", janNowak);
        ht.put("Woff", maciejWoff);
        ht.put("Tilson",mikeTilson);
        ht.put("Smith", johnSmith);

        ht.printHashTable();

        System.out.println("Retrieve key Woff :" +ht.get("Woff"));
    }
}
