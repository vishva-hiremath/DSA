package Datastructures.Queue.LeetCodes;

import Datastructures.Stack.LeetCodes.ArrayListStackPush.Stack;

public class MyQueueArrayList {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueueArrayList() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        // Transfer elements from stack1 to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        // Push the new value onto stack1
        stack1.push(value);
        // Transfer elements back from stack2 to stack1
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public Integer dequeue() {
    if(stack1.isEmpty()) return null;
    else return stack1.pop();
    }


    public int peek() {
        return stack1.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty();
    }
}
