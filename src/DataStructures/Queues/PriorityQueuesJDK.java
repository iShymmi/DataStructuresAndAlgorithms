package DataStructures.Queues;

import java.util.PriorityQueue;

public class PriorityQueuesJDK {

    public static void main(String... args){

        // Min heap implementation
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(25);
        priorityQueue.add(-22);
        priorityQueue.add(1343);
        priorityQueue.add(0);
        priorityQueue.add(-3492);
        priorityQueue.add(429);

        System.out.println(priorityQueue.peek());

        System.out.println("Removed item: " +priorityQueue.remove());
        System.out.println(priorityQueue.peek());

        // poll remove highest priority value aswell
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());

        System.out.println(priorityQueue.remove(25));

        Object[] ints = priorityQueue.toArray();

        System.out.println("Printing array: ");
        for(Object nums: ints){
            System.out.print(nums +" ");
        }

        System.out.println("\n"+priorityQueue.peek());

        priorityQueue.add(-1);
        System.out.println(priorityQueue.peek());
    }
}
