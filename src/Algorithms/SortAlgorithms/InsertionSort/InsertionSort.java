package Algorithms.SortAlgorithms.InsertionSort;

public class InsertionSort {

    public static void main(String... args){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        insertionSortRecursive(intArray, intArray.length);

        for(int element : intArray){
            System.out.println(element);
        }
    }

    public static void insertionSort(int[] input) {
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < input.length; firstUnsortedIndex++){
            //nextElement we want to insert into sorted partition
            int nextElement = input[firstUnsortedIndex];

            //we need i after the loop to insert next element on correct position
            int i;

            //we start from the first item we want to insert
            // i > 0 - we check if we hit end of array
            // intArray[i-1] - we check if previous element is grater then new element
            for(i = firstUnsortedIndex; i > 0 && input[i - 1] > nextElement; i--){
                //we need to shift to the right
                input[i] = input[i - 1];
            }

            input[i] = nextElement;
        }
    }

    public static void insertionSortRecursive(int[] input, int numItems){

        // It will go down to one element
        // If it will have one element it will break the recursion
        if(numItems < 2){
            return;
        }

        insertionSortRecursive(input, numItems - 1);

        // At first when we have 2 elements we start shifting it
        // After shifting it will drop back to next recursion

        resursiveShift(input, numItems - 1, input[numItems - 1]);

        System.out.println("Result of call whe numItems = " +numItems);
        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] +", ");
        }
        System.out.println("");
        System.out.println("----------------------");

    }

    public static void resursiveShift(int[] input, int numItems, int nextElement){
        if(numItems > 0 && input[numItems - 1] > nextElement){
            input[numItems] = input[numItems - 1];
            resursiveShift(input,numItems - 1, nextElement);
        }else {
            input[numItems] = nextElement;
        }
    }
}
