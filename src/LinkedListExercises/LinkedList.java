package LinkedListExercises;

import org.w3c.dom.Node;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = new Node(value);
            tail = head;
        }else{
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    public Node removeLast() {
        if (length == 0) return null;
         Node temp = head;
         Node pre = head;
        while (temp.next != null) {
             pre = temp;
             temp = temp.next;
         }
         tail = pre;
         tail.next = null;
         length--;
         if (length == 0) {
             head = null;
             tail = null;
         }
         System.out.println("After removing last");
         return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;tail = newNode;
        }
if (length >= 1) {
    newNode.next = head;
    head = newNode;

    }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if(length == 0 || index >= length || index < 0)  {
            return null;
        }else{
            Node temp = head;
            for (int i = 0; i < index; i++) {
                if (i == index){
                    break;
                }
                temp = temp.next;
        }
            return temp;
        }
    }

    public boolean set(int index, int value){
        if(length == 0 || index >= length || index < 0) return false;
        Node temp = get(index);
        temp.value = value;
        return true;
    }
}
