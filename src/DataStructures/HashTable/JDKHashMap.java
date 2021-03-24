package DataStructures.HashTable;

import DataStructures.ArrayList.Employee;

import java.util.HashMap;
import java.util.Map;

// JDK HashMap is Array implementation
public class JDKHashMap {

    public static void main(String... args){
        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);
        Employee billEnd = new Employee("Bill","End",78);

        Map<String, Employee> hashMap = new HashMap<>();

        hashMap.put("Nowak", janNowak);
        hashMap.put("Woff", maciejWoff);
        hashMap.put("Smith", johnSmith);

        // Trying to put new item with same key

        //hashMap.put("Woff",mikeTilson);

        // Put if absent method will put new item if hashmap doesn't contains it

        Employee employee = hashMap.putIfAbsent("Woff", mikeTilson);

        System.out.println(employee);

        // stop method from returning null, if there is nothing under key we provide it will return default value
        // in this example -> mikeTilson
        System.out.println(hashMap.getOrDefault("Someone", mikeTilson));

        // Retrieving by key will be faster
        System.out.println(hashMap.containsKey("Woff"));

        System.out.println(hashMap.containsValue(janNowak));

        hashMap.forEach((k,v) -> System.out.println("Key : " +k +", Employee: " +v));

        //Will return the item we are removing
        System.out.println(hashMap.remove("Nowak"));
    }
}
