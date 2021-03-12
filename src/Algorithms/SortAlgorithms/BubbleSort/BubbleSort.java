package Algorithms.SortAlgorithms.BubbleSort;

/*
    BubbleSort algorithm takes O(n^2) time complexity
 */

public class BubbleSort {

    public static void main(String... args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22 };


        //Sorting from start to end (ascending)
        // We can estimate time complexity looking how many loops are nested to finish the algorithm

        for (int lastUnsoredIndex = intArray.length - 1; lastUnsoredIndex > 0; lastUnsoredIndex--){
            for(int i = 0; i < lastUnsoredIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
        }

        //Sorting from end to start (ascending)

        for (int lastUnsoredIndex = 0; lastUnsoredIndex < intArray.length; lastUnsoredIndex++){
            for(int i = intArray.length - 1; i > lastUnsoredIndex; i--){
                if(intArray[i - 1] > intArray[i]){
                    swap(intArray, i - 1, i);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    //Method used to swap two elements in array
    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
