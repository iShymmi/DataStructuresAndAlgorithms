package Algorithms.SortAlgorithms.ShellSort;

public class ShellSort {

    public static void main(String... args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for(int gap = intArray.length / 2; gap > 0; gap /= 2){
            //Similary implementation as insertion sort
            for(int i = gap; i < intArray.length; i++){
                int nextElement = intArray[i];

                //we'll use j for traversing
                int j = i;
                //if j < gap it hits the front of the array
                while (j >= gap && intArray[j - gap] > nextElement){
                    //shift elements and set next index to chekck
                    intArray[j] = intArray[j - gap];
                    //if j would be less than gap it will hit front of array
                    //and loop won't execute
                    j -= gap;
                }

                //we found the j index which is position for nextElement
                intArray[j] = nextElement;
            }
        }


        //Shell Sort extension of Bubble Sort
        for (int gap = intArray.length / 2; gap > 0; gap /= 2){
            for(int i = gap; i < intArray.length; i ++){
                for(int j = i; j >= gap && intArray[j - gap] > intArray[j]; j-= gap){
                    swap(intArray, j - gap, j);
                }
            }
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
