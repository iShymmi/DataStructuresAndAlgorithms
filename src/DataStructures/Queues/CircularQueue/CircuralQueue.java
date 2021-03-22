package DataStructures.Queues.CircularQueue;

import DataStructures.ArrayList.Employee;

import java.util.NoSuchElementException;
import java.util.Queue;

// Thi implementation will wrap the back to empty space we have in the fron of queue
// if it hits the end of array
public class CircuralQueue<E> {

    private Object[] queue;
    private int front;
    private int back;

    public CircuralQueue(int capacity) {
        queue = new Object[capacity];
    }

    public void add(Object item){
        if(size() == queue.length - 1){
            int numItems = size();
            Object[] newArray = new Object[2 * queue.length];

            System.arraycopy(queue, front, newArray, 0, queue.length - 1);
            System.arraycopy(queue,0, newArray, queue.length - front, back);

            queue = newArray;

            front = 0;
            back = numItems;
        }

        //if array is full (size() == queue.length - 1) -> resize the queue
        // 0 - elem1 - front
        // 1 - elem2
        // 2 - elem3
        // 3 - elem4
        // 4         - back

        //if array is not full but end hits end of array
        // 0                   |    0 -     - back
        // 1                   |    1
        // 2 - elem3 - front   |    2 - elem3 -
        // 3         - back    |    3 - elem4 - elem4

        queue[back] = item;
        if(back < queue.length -1 ){
            back++;
        }
        else {
            back = 0;
        }
    }

    public E remove(){
        if(size() == 0){
            throw new NoSuchElementException();
        }
        @SuppressWarnings("unchecked")
        E removeObject = (E) queue[front];
        queue[front] = null;
        front++;

        //reset the queue to empty queue
        if(size() == 0) {
            front = 0;
            back = 0;
        }else if(front == queue.length){
            front = 0;
        }

        return removeObject;
    }

    public E peek() {
        if(size() == 0){
            throw new NoSuchElementException();
        }

        return (E) queue[front];
    }


    public int size(){
        //quque is not wrapped
        if(front <= back){
            return back - front;
        }else {
            //queue is wrapped
            return back - front + queue.length;
        }

    }

    public void printQueue() {
        if(front <= back){
            for (int i = front; i < back; i++){
                System.out.println(queue[i]);
            }
        } else {
            for(int i = front; i < queue.length; i++){
                System.out.println(queue[i]);
            }
            for(int i = 0; i < back; i++){
                System.out.println(queue[i]);
            }
        }

    }

}
