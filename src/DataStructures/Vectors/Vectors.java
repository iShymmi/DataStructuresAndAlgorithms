package DataStructures.Vectors;

import DataStructures.ArrayList.Employee;

import java.util.List;
import java.util.Vector;

//Vector behaves the same as ArrayList
public class Vectors {

    public static void main(String... args){

        // When we creating new instance of Vector Class it automatically
        // creates backing array of default capacity of 10 or given capacity
        List<Employee> employeeList = new Vector<>();

        // The difference betwen ArrayList add method and Vector add method is that
        // Vector add method is synchronized
        employeeList.add(new Employee("Jan","Nowak",123));
        employeeList.add(new Employee("Maciej","Woff",4567));
        employeeList.add(new Employee("John","Smith",22));
        employeeList.add(new Employee("Mike","Tilson",12345));

        // Other methods in Vector are as same as ArrayList method but in Vector
        // they are synchronized
    }

}
