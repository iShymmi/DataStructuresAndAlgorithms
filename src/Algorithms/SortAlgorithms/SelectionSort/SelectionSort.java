package Algorithms.SortAlgorithms.SelectionSort;

public class SelectionSort {

    public static void main(String... args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){

            //index of largest element
            int largest = 0;

            for(int i = 1 ; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }

            //we are swapping largest item with last item in unsorted partition
            swap(intArray, largest, lastUnsortedIndex);
        }

        for(int element : intArray){
            System.out.println(element);
        }


    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
