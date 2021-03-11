package DataStructures.Arrays;

public class Arrays {

    public static void main(String... args){
        // array of ints
        // array is not dynamic - can't increase or decrease its size
        int[] intArray = new int[7];

        //Address of every element if:
            // start address of array = 12
            // size each element is 4 bytes (int)

        // arrays starts from index 0 because of the memory index calculationo
        intArray[0] = 20;   // 12 + (0x4) = 12
        intArray[1] = 35;   // 12 + (1*4) = 16
        intArray[2] = -15;  // 12 + (2*4) = 20
        intArray[3] = 7;    // 12 + (3*4) = 24
        intArray[4] = 55;   // 12 + (4*4) = 28
        intArray[5] = 1;    // 12 + (5*4) = 32
        intArray[6] = -22;  // 12 + (6*4) = 36

        //Displays all elements from array

        for(int i = 0 ; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

        //####### Searching for element index in array (O(n)) #######

        int index = -1;

        for (int i = 0 ; i < intArray.length; i++){
            if(intArray[i] == 7){
                index = i;
                break;
            }
        }

        System.out.println("Index = " +index);

            // Worst case for this is that we have to go trhough the whole array
            // For this case time complexity is linear, O(n)

        // ####### Adding additional element to array (O(n)) #######

            // Array is not dynamic data strucure so we need to make a copy of exisitng array
            // and add additional space for extra items

        int[] extraIntArray = new int[intArray.length + 1];

        for(int i = 0; i < extraIntArray.length; i++){
            if(i < intArray.length)
                extraIntArray[i] = intArray[i];
            else
                extraIntArray[i] = 8;
        }

            // In this case it time complexity is linear, O(n)


        // ############## Others operations time complexity ##############

        // ####### Add element to end of an array (has space) (O(1)) #######
        // ####### Insert or update element at a specific index (O(1)) #######
        // ####### Delete an element by setting it to null (O(1)) #######
        // // ####### Delete an element by shifting elements (O(n)) #######
    }
}
