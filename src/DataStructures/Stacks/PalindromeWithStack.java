package DataStructures.Stacks;

import DataStructures.Stacks.LinkedListStack.LinkedListStack;

public class PalindromeWithStack {

    public static void main(String[] args) {
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
        String palindrome = string.replaceAll("[^a-zA-Z]","")
                            .toLowerCase();

        LinkedListStack<Character> stack = new LinkedListStack<Character>();

        for(int i = 0; i < palindrome.length(); i++){
            stack.push(palindrome.charAt(i));
        }

        StringBuilder poppedString = new StringBuilder();

        while(!stack.isEmpty()) {
            poppedString.append(stack.pop());
        }

        return palindrome.equals(poppedString.toString());
    }

}
