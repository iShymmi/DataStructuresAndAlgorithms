package Algorithms.SortAlgorithms.MergeSort;

public class MergeSort {

    public static void main(String... args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeWrap(intArray);

        for (int element : intArray){
            System.out.println(element);
        }
    }

    // {20, 35, -15, 7, 55, 1, -22}
    public static void mergeSort(int[] input, int start, int end){

        if(end - start < 2){
            return;
        }

        int mid = (start + end) / 2;
        //partitioning left side of array
        //first run {20, 35, -15}
        mergeSort(input, start, mid);

        //partitioning right side of array
        //first run {7, 55, 1, -22}
        mergeSort(input, mid, end);

        merge(input, start, mid, end);

    }

    public static void merge(int[] input, int start, int mid, int end) {

        // we are always merging sorted partition
        // mid - 1 is the last element in the left partition
        // input mid is the first element of right partition
        // so if mid - 1 is less than mid the elements are in the right order
        // and we have nothing to do here
        if( input[mid -1] <= input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];

        //we want to drop out when we finish traversing left or rith array
        while (i < mid && j < end){
            // we are comparing current element of the left partition with
            // with the current element of the right partition
            // <= prevent from changing order so it becomes stable algorithm

            // tempIndex++ - we put element in current position and move to next position
            // input[i] <= input[j] - if element of index i is less or equal to element of index[j]
            // we put input[i++] on current position and then increment i to point next position
            // otherwise we put input[j++] on current position and then increment i to point next position
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        // if there are leftover elements in the left partition we need to write them to input array
        // we don't need to handle elements that leftover in the right partition because they are in the right position

        // copy leftovers to input array on the right position ( if mid - i > 0 )
        // if mid - 1 will be 0 ( so we finished traversing left before right) it won't do anything
        System.arraycopy(input, i, input, start + tempIndex, mid - i);

        // copy as many elemenets as we actually copied into the temp array
        System.arraycopy(temp, 0, input, start, tempIndex);
    }

    //Wrap to use only one argument to sort whole array
    public static void mergeWrap(int[] input){
        mergeSort(input,0,input.length);
    }
}
