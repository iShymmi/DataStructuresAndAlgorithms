package Algorithms.SortAlgorithms.Recursion;

public class Recursion {

    public static void main(String... args){

        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));

    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!
    // 4! = 4 * 3 * 2 * 1 = 4 * 3!
    // ...
    // n! = n * (n - 1)!

    //                       A
    // recursiveFactorial(0) |   | Retrun 1
    // recursiveFactorial(1) |   | Return 1 * 0! (from return above) = 1
    // recursiveFactorial(2) |   | Return 2 * 1! (from return above) = 2
    // recursiveFactorial(3) |   | Return 3 * 2! (from return above) = 6
    //                           V

    public static int recursiveFactorial(int num){

        // condition to end recursion
        // breaking condition / base condition
        if(num == 0){
            return 1;
        }
        // it will return stack overflow error if there won't be breaking condition


        //this function call its selft to get previous factorial
        //untill it will hit the 0! and return 1
        return num * recursiveFactorial(num - 1);
    }

    //Function to count factorial in iterative way
    //It's not using recursion
    public static int iterativeFactorial(int num){
        if( num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num ; i++){
            factorial *= i;
        }

        return factorial;
    }
}
