package Datastructures.Stack.LeetCodes.ArrayListStackPush;

public class BalancedStringMain {

    public static boolean isBalancedParentheses(String s) {
        Stack<Character> stack = new Stack();
        char[] chars = s.toCharArray();
        for( char aChar : chars ) {
            if( aChar == '(' )
            stack.push(aChar);
            else{
                if(!stack.isEmpty())
              stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();

    }

        public static void main(String[] args) {
            testAndPrint("()", true);
            testAndPrint("()()", true);
            testAndPrint("(())", true);
            testAndPrint("()()()", true);
            testAndPrint("(()())", true);
            testAndPrint(")()(", false);
            testAndPrint(")(", false);
            testAndPrint("(()", false);
            testAndPrint("))", false);
            testAndPrint("(", false);
            testAndPrint(")", false);
        }

        public static void testAndPrint(String testStr, boolean expected) {
            // Run the test and store the result
            boolean result = isBalancedParentheses(testStr);

            // Print the test string, expected result, and actual result
            System.out.println("Test String: " + testStr);
            System.out.println("EXPECTED: " + expected);
            System.out.println("RESULT: " + result);

            // Check if the test passed or failed
            if (result == expected) {
                System.out.println("STATUS: PASS");
            } else {
                System.out.println("STATUS: FAIL");
            }

            // Print a separator for better readability
            System.out.println("--------------");
        }

    }

