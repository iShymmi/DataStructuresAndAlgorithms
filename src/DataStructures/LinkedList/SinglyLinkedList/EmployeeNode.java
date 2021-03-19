package DataStructures.LinkedList.SinglyLinkedList;

import DataStructures.ArrayList.Employee;

// Node will store object and the next object reference
// This is only for my project to learn about how Linked List is implemented
// As normally I'll use LinkedList implementation provided by JDK
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    //In the part of creating node we don't have any infromations about next node
    public EmployeeNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public String toString() {
        return employee.toString();
    }
}
