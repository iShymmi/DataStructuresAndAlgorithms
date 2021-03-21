package DataStructures.Stacks.ArrayStack;

import DataStructures.ArrayList.Employee;

public class ArrayStackMain {

    public static void main(String... args){

        ArrayStack stack = new ArrayStack(10);

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);
        Employee billEnd = new Employee("Bill","End",78);

        stack.push(janNowak);
        stack.push(maciejWoff);
        stack.push(johnSmith);
        stack.push(mikeTilson);
        stack.push(billEnd);

        System.out.println("Stack after pushing items");
        stack.printStack();

        System.out.println("\nPeek item");
        System.out.println(stack.peek() + "\nStack after peek");
        stack.printStack();

        System.out.println("\nPop item");
        System.out.println(stack.pop() + "\nStack after pop");
        stack.printStack();
    }
}
