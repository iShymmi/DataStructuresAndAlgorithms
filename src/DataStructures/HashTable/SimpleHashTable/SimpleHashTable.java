package DataStructures.HashTable.SimpleHashTable;

import DataStructures.ArrayList.Employee;

public class SimpleHashTable {

    private Employee[] hashtable;

    public SimpleHashTable(){
        hashtable = new Employee[10];
    }

    //This implementation doesn't handle collisions
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null){
            System.out.println("Sorry, there's already an employee at position " +hashedKey);
        }else {
            hashtable[hashedKey] = employee;
        }
    }

    //Retrieval is constant time (O(1))
    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    //If 2 employees have same length of last name it will cause collision
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashTable(){
        for(int i = 0; i < hashtable.length ; i++){
            System.out.println(hashtable[i]);
        }
    }
}
