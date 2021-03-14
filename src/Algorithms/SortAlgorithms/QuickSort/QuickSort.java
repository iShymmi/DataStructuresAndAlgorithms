package Algorithms.SortAlgorithms.QuickSort;

public class QuickSort {

    public static void main(String... args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSortWrap(intArray);

        for(int element: intArray){
            System.out.println(element);
        }
    }

    public static void quickSort(int[] input, int start, int end){

        //if end - start < 2 we are dealing with 1 element array
        if(end - start < 2){
            return;
        }

        //put the pivot in the correct position
        int pivotIndex = partition(input, start, end);

        //we want to quic sort left part of array and the right part of array
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex +1, end);

    }

    public static int partition(int[] input, int start, int end){
        // this is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        //we want to traverse the part of array till i and j didn't cross
        while (i < j){
            // at first we are going to use j to look for elements
            // that are less than the pivot
            // as same we want to stop if they cross

            // NOTE: empty loop body
            // --i - our last element start from index one less than end
            while(i < j && input[--j] >= pivot);

            // if we dropped out of the loop because we found element
            // that is less than pivot we move the element
            if(i < j){
                input[i] = input[j];
            }

            // NOTE: empty loop body
            // ++i - our first element starts from index one more than pivot
            while(i < j && input[++i] <= pivot);

            // if we dropped out of the loop because we found element
            // that is greater than pivot we move the element
            if(i < j){
                input[j] = input[i];
            }
        }

        // at this point the index j will be the position we want to insert the pivot

        input[j] = pivot;

        return j;
    }

    //wrap quick sort to use only one argument
    public static void quickSortWrap(int[] input){
        quickSort(input, 0, input.length);
    }
}
