package Datastructures.LinkedList;

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
    public boolean insert(int index, int value){
        if(length == 0 || index > length || index < 0) return false;
        Node newNode = new Node(value);
        if(index == 0){
        prepend(value);
        return true;}
        if(index == length){
           append(value);
           return true;
        }
        Node temp = get(index);
        newNode.next = temp;
        get(index-1).next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(length == 0 || index >= length || index < 0) return null;
        Node temp = get(index);
        if(index == 0){removeFirst(); return temp;}
        if(index == length-1){removeLast(); return temp;}
        Node prev = get(index-1);
        prev.next = prev.next.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i=0; i <length; i++){
            after = temp.next;
            temp.next = before;

            before = temp;
            temp = after;

        }
        /*Node temp =tail;
        Node temp1;
        for (int i = length-1; i > 0; i--) {
           temp1  = get(i);
           temp1.next = get(i-1);
        }
        head.next = null;
        tail = head;
        head = temp;*/
    }
}
