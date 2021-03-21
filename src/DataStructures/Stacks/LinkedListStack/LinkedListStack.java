package DataStructures.Stacks.LinkedListStack;

import DataStructures.ArrayList.Employee;

import java.util.LinkedList;

public class LinkedListStack<T> {

    // LinkedList used doubly linked list
    // stack doesn't need this behavior so if we care about memory
    // we will have to implement singly list instead
    private LinkedList<T> stack;

    // we want this class to behave like a stack so we need to only expose
    // the methods that which the stac should contains
    public LinkedListStack(){
        stack = new LinkedList<>();
    }

    public void push(T item){
        stack.push(item);
    }

    public T pop(){
        return stack.pop();
    }

    public T peek(){
        return stack.peek();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public void printStack(){
        stack.forEach(System.out::println);
    }
}
