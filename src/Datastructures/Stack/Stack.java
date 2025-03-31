package Datastructures.Stack;

public class Stack {
    private Node top;
    private int height;
    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    public Stack(int value){
     Node newNode = new Node(value);
     top = newNode;
     height = 1;
    }

    public void push(int value){
        Node newNode = new Node(value);
        if(top == null){
        top = newNode;
        } else{
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop(){
        if(top == null) return null;
        Node temp = top;
        if(height == 1){
            temp.next = null;
        }else{
            top = top.next;
            temp.next = null;
        }
        height--;
        return temp;
    }

    public void printStack(){
        Node temp = top;
        while(temp != null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("Top: " + top.value);
        System.out.println("Length: " + this.height);
    }

    public int getTop(){
        return top.value;
    }
    public int getHeight(){
        return this.height;
    }
}
