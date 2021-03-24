package DataStructures.HashTable.Chaining;

import DataStructures.ArrayList.Employee;
import DataStructures.HashTable.LinearProbing.SimpleHashTableLP;

public class ChainedHashTableMain {

    public static void main(String... args){

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);
        Employee billEnd = new Employee("Bill","End",78);

        ChainedHashTable ht = new ChainedHashTable();

        ht.put("Nowak", janNowak);
        ht.put("Woff", maciejWoff);
        ht.put("Tilson",mikeTilson);
        ht.put("Smith", johnSmith);

        ht.printHashtable();

        System.out.println("\nRetrieve key Smith :" +ht.get("Smith"));

        System.out.println("\nRemoving items [Smith,Tilson] :");
        ht.remove("Tilson");
        ht.remove("Smith");
        ht.printHashtable();

    }
}
