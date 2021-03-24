package Algorithms.SearchAlgorithms.LinearSearch;

// Basic a easiest search algorithm
// Checks every item one by one to find out sought value
// Time complexity for this algorithm is O(n)
public class LinearSearchAlgorithm {

    public static void main(String... args){

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(linearSearch(intArray,-15));
        System.out.println(linearSearch(intArray,1));
        System.out.println(linearSearch(intArray,8888));
        System.out.println(linearSearch(intArray,-22));
    }

    //will return the index of the value
    public static int linearSearch(int[] input, int value){
        for(int i = 0; i < input.length; i++){
            if(input[i] == value){
                return i;
            }
        }

        return -1;
    }
}

