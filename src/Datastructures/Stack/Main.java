package Datastructures.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(1);
        stack.push(2);
        stack.push(3);
        stack.printStack();
        stack.pop();
        stack.printStack();

        stack.pop();
        stack.printStack();

    }
}
