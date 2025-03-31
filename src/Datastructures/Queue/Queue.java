package Datastructures.Queue;

import org.w3c.dom.Node;

public class Queue {
    Node first;
    Node last;
    int length;
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }
    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue(){
        Node temp = first;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("First: " + first.value);
        System.out.println("Last: " + last.value);
        System.out.println("Length: " + length);
    }

    public int getLength(){
        return length;
    }

    public int getFirst(){
        return first.value;
    }

    public int getLast(){
        return last.value;
    }

    public void enqueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            first = newNode;
            last = newNode;
        } else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue(){
        if(length == 0){ return null;}
        Node temp = first;
        if(length == 1){
            first = null; last = null;
        }
        else{
            first = first.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
