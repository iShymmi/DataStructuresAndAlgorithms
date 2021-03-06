package Algorithms.SortAlgorithms.RadixSort;

public class RadixSort {

    public static void main(String... args){
        int[] intArray = {4725, 4586, 1330, 8792, 1594, 5729};
        String[] stringArray = {"bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};

        radixSort(intArray, 10, 4);

        radixSort(stringArray, 26, 5);

        for(int element: intArray){
            System.out.println(element);
        }

        for(String element: stringArray){
            System.out.println(element);
        }
    }

    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(int[] input, int position, int radix){

        int numItems = input.length;
        int[] countArray = new int[radix];

        // for every value we will get digit on the position
        // for stable version of this algorithms we want to know how many values
        // have a certain digit in whatever position we're looking at
        for(int value: input){
            countArray[getDigit(position, value, radix)]++;
        }

        // we count the sum how many values have digits less or equal than
        // for j = 1 how many values we have with that digits are less or equal 1
        // its adjust the count array
        for(int j = 1; j < radix ; j++){
            countArray[j] += countArray[j - 1];
        }

        // we are going to copy values into temporary array working from right to left
        // it need to have enought space to keep our items
        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position,input[tempIndex],radix)]] = input[tempIndex];
        }

        //copying values in correct position into original array
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getDigit(int position, int value, int radix){

        // we will return the digit on the right position
        // if position is 0 math power 10 to 0 will be 1
        // so for 4725 / 1 = 4725
        // and we modulo 4725 by radix which is 10 so we get 5

        // for position 2 (hundreds) math power 10 to 2 will be 100
        // for 4725 / 100 = 47
        // then 47 % 10 gives us 7

        return value / (int) Math.pow(radix,position) % radix;
    }


    public static void radixSort(String[] input, int radix, int width){
        for(int i = width - 1; i >= 0; i--){
            radixSingleSort(input, i, radix);
        }
    }

    public static void radixSingleSort(String[] input, int position, int radix){

        int numItems = input.length;
        int[] countArray = new int[radix];

        // for every value we will get digit on the position
        // for stable version of this algorithms we want to know how many values
        // have a certain digit in whatever position we're looking at
        for(String value: input){
            countArray[getIndex(position, value)]++;
        }

        // we count the sum how many values have digits less or equal than
        // for j = 1 how many values we have with that digits are less or equal 1
        // its adjust the count array
        for(int j = 1; j < radix ; j++){
            countArray[j] += countArray[j - 1];
        }

        // we are going to copy values into temporary array working from right to left
        // it need to have enought space to keep our items
        String[] temp = new String[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getIndex(position,input[tempIndex])]] = input[tempIndex];
        }

        //copying values in correct position into original array
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }

    public static int getIndex(int position, String value){
        // a is 97 in ASCI position so if we want to know the index
        // of character on the position substract a from the character on the position
        // It will give us for example if at the position we have a
        // a - a will give 0, b - a = 1, c - a = 2 ...
        return value.charAt(position) - 'a';
    }


}
