package Datastructures.Stack.LeetCodes.ArrayListStackPush;

public class SortStackMain {


    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack();

       while (!stack.isEmpty()) {
           int currentElement = stack.pop();
           if (!tempStack.isEmpty()) {
           if(tempStack.peek()<currentElement && !tempStack.isEmpty()) tempStack.push(currentElement);
           else {
               while(!tempStack.isEmpty()) {
                   stack.push(tempStack.pop());
               }
               tempStack.push(currentElement);
           }}
           else tempStack.push(currentElement);

       }
       while (!tempStack.isEmpty()) {
           stack.push(tempStack.pop());
       }

    }


        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(3);
            stack.push(1);
            stack.push(4);
            stack.push(2);

            System.out.println("Before sorting:");
            stack.printStack();

            sortStack(stack);

            System.out.println("\nAfter sorting:");
            stack.printStack();

        /*
            EXPECTED OUTPUT:
            ----------------
            Before sorting:
            4
            1
            5
            2
            3

            After sorting:
            1
            2
            3
            4
            5

        */

        }


}
