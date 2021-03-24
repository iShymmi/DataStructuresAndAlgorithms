package Algorithms.SortAlgorithms.BucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String... args){

        int[] intArray = {54, 46, 83, 66, 95, 92, 43};

        bucketSort(intArray);

        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input){
        List<Integer>[] buckets = new List[10];

        for(int i = 0; i < buckets.length; i++){
            // using array list for the buckets
            buckets[i] = new ArrayList<Integer>();

            // using linked list for th buckets
            // buckets[i] = new LinkedList<Integer>();
        }

        for(int i =0; i < input.length; i++){
            buckets[hash(input[i])].add(input[i]);
        }

        for(List<Integer> bucket: buckets){
            //Collections.srot() uses adaptive Merge sort
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++){
            for(int value: buckets[i]){
                input[j++] = value;
            }
        }
    }

    public static int hash(int value){
        return value / (int) 10;
    }
}
