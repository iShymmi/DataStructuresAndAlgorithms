package DataStructures.Queues;

import DataStructures.Queues.CircularQueue.CircuralQueue;
import DataStructures.Stacks.LinkedListStack.LinkedListStack;

public class PalindromeWithStackAndQueue {

    public static void main(String... args) {

        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        String newString = string.replaceAll("[^a-zA-Z]","").toLowerCase();

        LinkedListStack<Character> stack = new LinkedListStack<>();
        CircuralQueue<Character> queue = new CircuralQueue<>(newString.length());

        for(int i = 0; i < newString.length(); i++){
            char c = newString.charAt(i);

            stack.push(c);
            queue.add(c);
        }

        while(!stack.isEmpty()){
            if(!stack.pop().equals(queue.remove())){
                return false;
            };
        }

        return true;
    }
}
