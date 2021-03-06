package DataStructures.LinkedList.DoublyLinkedList;

import DataStructures.ArrayList.Employee;

public class EmployeeDoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if (head == null){
            tail = node;
        }else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null){
            head = node;
        }else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee){
        EmployeeNode node = head;

        if(head == null){
            return false;
        }

        while(node.getNext() != null && !node.getEmployee().equals(existingEmployee)){
            node = node.getNext();
        }

        if(node == null){
            return false;
        }

        EmployeeNode newEmployeeNode = new EmployeeNode(newEmployee);
        newEmployeeNode.setPrevious(node.getPrevious());
        newEmployeeNode.setNext(node);
        node.setPrevious(newEmployeeNode);

        if(head == node){
            head = newEmployeeNode;
        }else {
            newEmployeeNode.getPrevious().setNext(newEmployeeNode);
        }

        size++;

        return true;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = head;

        if(head.getNext() == null){
            tail = null;
        }else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        //cleaning references
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeNode removeFromEnd(){
        if(isEmpty()){
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null){
            head = null;
        }else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        size--;

        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.print("null \n");
    }
}
