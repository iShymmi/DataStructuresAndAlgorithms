package DataStructures.Queues.CircularQueue;

import DataStructures.ArrayList.Employee;

public class CircularQueueMain {

    public static void main(String... args){

        Employee janNowak = new Employee("Jan","Nowak",123);
        Employee maciejWoff = new Employee("Maciej","Woff",4567);
        Employee johnSmith = new Employee("John","Smith",22);
        Employee mikeTilson = new Employee("Mike","Tilson",12345);
        Employee billEnd = new Employee("Bill","End",78);

        CircuralQueue<Employee> queue = new CircuralQueue<Employee>(5);

        /*queue.add(janNowak);
        queue.add(maciejWoff);
        queue.remove();
        queue.add(johnSmith);
        queue.remove();
        queue.add(mikeTilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janNowak);

        queue.printQueue();*/

        queue.add(janNowak);
        queue.add(maciejWoff);
        queue.add(johnSmith);
        queue.add(mikeTilson);

        //queue will be resized now
        queue.add(billEnd);

        System.out.println("Queue after adding items");

        queue.printQueue();

        System.out.println("\nQueue after removing 2 items");
        queue.remove();
        queue.remove();
        queue.printQueue();

        System.out.println("\nQueue after peek item");
        System.out.println("Peek item: " +queue.peek());
        queue.printQueue();

        System.out.println("Remove more items than queue contains");
        queue.remove();
        queue.remove();
        queue.remove();

        queue.printQueue();

        /*System.out.println("Removing one more element to induce NoSuchElementException");
        queue.remove();*/

        System.out.println("\nAdd queue to empty queue");
        queue.add(janNowak);
        queue.printQueue();


    }
}
