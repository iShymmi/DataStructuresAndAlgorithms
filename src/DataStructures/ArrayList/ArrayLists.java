package DataStructures.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String... args){
        //If we use type of List instead of specified implementation is thaht if
        //we decide to change it later it will be easier to do

        List<Employee> employeeList = new ArrayList<>();


        // Array doesn't have to be resized because default capacity for ArrayList is 10
        employeeList.add(new Employee("Jan","Nowak",123));
        employeeList.add(new Employee("Maciej","Woff",4567));
        employeeList.add(new Employee("John","Smith",22));
        employeeList.add(new Employee("Mike","Tilson",12345));

        // When we are adding elements to the array ArrayList implementation checks if
        // the backing array isn't full if it will be full it will automaticly resize it

        // printing out all elements from array
        employeeList.forEach(System.out::println);

        // printing out specified element from list
        // time complexity for this operation is O(1) if we know the index
        System.out.println(employeeList.get(1));

        // checks wether list is empty
        System.out.println(employeeList.isEmpty());

        // replace element of specified index
        // it will perform with constant time complexity
        employeeList.set(1, new Employee("Maciej","Gub",4568));

        // Returns how many items is in the list ( not the capacity )
        System.out.println(employeeList.size());

        // Add element on specified position
        // Worst time complexity for adding this way would be O(n) because
        // of it will need to shift the elements to add new element
        employeeList.add(3, new Employee("Marilyn","Hey",432));

        // Returns array of object type
        Object[] employeeArray = employeeList.toArray();

        // Returns array and pass it to Employee array type
        Employee[] employeeArrayWithType = employeeList.toArray(new Employee[0]);

        for (Employee employee: employeeArrayWithType){
            System.out.println(employee);
        }

        // checks if the list contains element
        // ! WARNING ! if we want to use this method have to implement equal method
        // Otherwise it checks if the elements are the same istance of the object
        System.out.println(employeeList.contains(new Employee("Mike","Tilson",12345)));

        // returns the index of specified element
        // it requires equal method
        System.out.println(employeeList.indexOf(new Employee("Jan","Nowak",123)));


        //When we remove element from list, items after that element have to be shifted down
        employeeList.remove(2);

        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
