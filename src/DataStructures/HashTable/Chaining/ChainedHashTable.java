package DataStructures.HashTable.Chaining;

import DataStructures.ArrayList.Employee;
import DataStructures.HashTable.LinearProbing.StoredEmployee;

import java.util.LinkedList;

// It's much simpler than Linear Probing
// Worst time complexity to retrieve an item is O(n)
public class ChainedHashTable {

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashTable(){
        hashTable = new LinkedList[10];
        for (int i = 0; i < hashTable.length; i++){
            hashTable[i] = new LinkedList<>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        hashTable[hashedKey].add(new StoredEmployee(key,employee));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);

        for(StoredEmployee e : hashTable[hashedKey]){
            if(e.getKey().equals(key)){
                return e.getEmployee();
            }
        }

        return null;
    }

    public Employee remove(String key){
        int hashedKey = hashKey(key);

        StoredEmployee employee = null;
        int index = -1;
        for(StoredEmployee e : hashTable[hashedKey]){
            index++;
            if(e.getKey().equals(key)){
                employee = e;
                break;
            }
        }

        if(employee == null){
            return null;
        }else {
            hashTable[hashedKey].remove(index);
            return employee.getEmployee();
        }
    }

    private int hashKey(String key){
        // return key.length() % hashTable.length;
        return Math.abs(key.hashCode() %hashTable.length);
    }

    public void printHashtable(){
        for(LinkedList<StoredEmployee> employees : hashTable){
            if (employees.isEmpty()){
                System.out.println("Position empty");
            }else {
                System.out.print("Position: ");
                for(StoredEmployee employee: employees){
                    System.out.print(employee.getEmployee());
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }
}
