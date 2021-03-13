package Algorithms.SortAlgorithms.InsertionSort;

public class InsertionSort {

    public static void main(String... args){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            //nextElement we want to insert into sorted partition
            int nextElement = intArray[firstUnsortedIndex];

            //we need i after the loop to insert next element on correct position
            int i;

            //we start from the first item we want to insert
            // i > 0 - we check if we hit end of array
            // intArray[i-1] - we check if previous element is grater then new element
            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > nextElement; i--){
                //we need to shift to the right
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = nextElement;
        }

        for(int element : intArray){
            System.out.println(element);
        }

    }
}
