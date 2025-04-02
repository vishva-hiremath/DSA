package Datastructures.Stack.LeetCodes.ArrayListStackPush;

public class ReverseStringMain {

    public static String reverseString(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        String reversedChars = "";
        for( char aChar : chars ) {
           stack.push(aChar);
        }
        for( int i = 0; i < chars.length; i++ ) {
            reversedChars +=  stack.pop();
        }
        return reversedChars;
    }



        public static void main(String[] args) {

            String myString = "hello";
            String reversedString = reverseString(myString);
            System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

        }

    }
