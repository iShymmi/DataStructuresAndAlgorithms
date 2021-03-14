package Algorithms.SortAlgorithms.CountingSort;

public class CountingSort {

    public static void main(String... args){
        int[] intArray = {2, 5, 9, 8, 2, 8, 7, 10, 4, 3};

        countingSort(intArray,1 , 10);

        for(int element: intArray){
            System.out.println(element);
        }
    }

    public static void countingSort(int[] input, int min, int max){

        int [] countArray = new int[(max-min) +1];

        //counting phase
        for (int i = 0; i < input.length; i++){

            // we can search in values which would be for example like 10 - 20
            // so we need to check what position next value will take
            // relative to our minimum
            countArray[input[i] - min]++;
        }

        int j = 0;
        for (int i = min; i <= max; i++){
            //we are rewrting elements into our input array in correct order
            while(countArray[i - min] > 0){
                //place on the index j and increment the index
                input[j++] = i;
                countArray[i - min]--;
            }
        }

    }
}
