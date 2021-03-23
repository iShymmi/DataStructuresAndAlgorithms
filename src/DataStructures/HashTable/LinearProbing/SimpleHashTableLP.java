package DataStructures.HashTable.LinearProbing;

import DataStructures.ArrayList.Employee;

// Linear Probing will increse the Hash Value by 1 if the position we want add new item
// will be occupied
public class SimpleHashTableLP {

    private StoredEmployee[] hashtable;

    public SimpleHashTableLP(){
        hashtable = new StoredEmployee[10];
    }

    // This implementation handle collisions
    // Because of linear probing worst time complexity become O(n)
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);

        // will do linear probing
        if(occupied(hashedKey)){
            // will use to stop searching if our searchin hits end array
            // and wrap to beginning of the array
            int stopIndex = hashedKey;

            // back to front of the array
            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            }else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        // if is occupied that means the array is full
        if(occupied(hashedKey)){
            System.out.println("Sorry, there's already an employee at position " +hashedKey);
        }else {
            hashtable[hashedKey] = new StoredEmployee(key,employee);
        }
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }

        return hashtable[hashedKey].getEmployee();
    }

    public Employee remove(String key){
        // will use linear probing to find position of item to remove
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }

        Employee employee = hashtable[hashedKey].getEmployee();

        // Setting this position to null will cause bugs in reaching and removing
        // further elements. To fix that we will do Rehashing of our Hash Map.
        // This will cause deterioration of time complexity while removing items

        hashtable[hashedKey] = null;
        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];

        // Rehashing
        for(int i = 0; i < oldHashTable.length; i++){
            if(oldHashTable[i] != null){
                put(oldHashTable[i].getKey(),oldHashTable[i].getEmployee());
            }
        }

        return employee;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    //If 2 employees have same length of last name it will cause collision
    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private int findKey(String key){
        //first position to search
        int hashedKey = hashKey(key);

        if(hashtable[hashedKey] !=null && hashtable[hashedKey].getKey().equals(key)){
            return hashedKey;
        }

        // linear probing same as in adding method


        // will use to stop searching if our searchin hits end array
        // and wrap to beginning of the array
        int stopIndex = hashedKey;

        // back to front of the array
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex
                && hashtable[hashedKey] != null
                && !hashtable[hashedKey].getKey().equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null
                && hashtable[hashedKey].getKey().equals(key)){
            return hashedKey;
        }else {
            return -1;
        }
    }

    public void printHashTable(){
        for(int i = 0; i < hashtable.length ; i++){
            if(hashtable[i] == null){
                System.out.println("empty");
            }else {
                System.out.println("Position = " +i +": " +hashtable[i].getEmployee());
            }
        }
    }
}
