package Datastructures.Stack.LeetCodes.ArrayListStackPush;

public class Main {

    public static void main(String[] args) {

        Stack myStack = new Stack();

        myStack.push(1);
        myStack.push(2);
        myStack.push("Vishva");

        myStack.printStack();

        /*
            EXPECTED OUTPUT:
			3
			2
			1

        */
        System.out.println("Stack before pop():");
        myStack.printStack();

        System.out.println("\nPopped node:");
        System.out.println((myStack).pop());

        System.out.println("\nStack after pop():");
        myStack.printStack();

    }

}
