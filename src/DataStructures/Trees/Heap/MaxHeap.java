package DataStructures.Trees.Heap;

public class MaxHeap {

    private int[] heap;
    private int size;

    public MaxHeap(int capacity){
        heap = new int[capacity];
    }

    // Time complexity for insert is O(logn)
    public void insert(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException("Heap is full");
        }

        heap[size] = value;

        fixHeapAbove(size);
        size++;
    }

    // we will delete by index
    // Time complexity for deletion ( with find an element ) will be O(n) in worst case
    public int delete(int index){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int parent = getParent(index);
        int deletedValue = heap[index];

        heap[index] = heap[size - 1];

        if(index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size - 1);
        }else {
            fixHeapAbove(index);
        }

        size--;

        return deletedValue;
    }

    public int peek(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        return heap[0];
    }

    //Sorting heap
    //! We can't use heap after sorting as Heap ! It's not longer a heap
    public void sort(){
        int lastHeapIndex = size - 1;
        for(int i = 0; i < lastHeapIndex; i++){
            int tmp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = tmp;

            fixHeapBelow(0, lastHeapIndex - i - 1);
        }
    }

    private void fixHeapBelow(int index, int lastHeapIndex){
        int childToSwap;

        while( index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);

            //have left child
            if (leftChild <= lastHeapIndex) {
                //doesnt have right child
                if (rightChild > lastHeapIndex) {
                    childToSwap = leftChild;
                } else {
                    // have left and right child
                    childToSwap = (heap[leftChild] > heap[rightChild] ? leftChild : rightChild);
                }

                if (heap[index] < heap[childToSwap]) {
                    int tmp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = tmp;
                }else {
                    break;
                }

                index = childToSwap;
            }else {
                break;
            }
        }
    }

    private void fixHeapAbove(int index){
        int newValue = heap[index];
        while (index > 0 && newValue > heap[getParent(index)]){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = newValue;
    }

    public void printHeap(){
        for(int i = 0; i < size; i++){
            System.out.print(heap[i] + ", ");
        }
        System.out.println();
    }

    public boolean isFull(){
        return size == heap.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getParent(int index){
        //It will be rounded down automatically because of int type
        return (index - 1) / 2;
    }

    public int getChild(int index, boolean left){
        return  2 * index + (left ? 1 : 2);
    }
}
