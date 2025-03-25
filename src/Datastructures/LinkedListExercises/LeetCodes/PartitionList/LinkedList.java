package Datastructures.LinkedListExercises.LeetCodes.PartitionList;

    public class LinkedList {

        private Node head;
        private int length;

        class Node {
            int value;
            Node next;

            Node(int value) {
                this.value = value;
            }
        }

        public LinkedList(int value) {
            Node newNode = new Node(value);
            head = newNode;
            length = 1;
        }

        public Node getHead() {
            return head;
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
            } else {
                System.out.println("Head: " + head.value);
            }
            System.out.println("Length:" + length);
            System.out.println("\nLinked List:");
            if (length == 0) {
                System.out.println("empty");
            } else {
                printList();
            }
        }

        public void makeEmpty() {
            head = null;
            length = 0;
        }
        public void append(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            length++;
        }

        public void partitionList(int x){
            if (head == null) {}
            else {
                Node small = null;
                Node big = null;
                Node current = head;
                Node firstBigNode = null;
                Node firstSmallNode = null;
                while (current != null) {

                    if(current.value < x) {
                        if (small == null) {
                            firstSmallNode = current;
                            small = current;
                        } else{
                        small.next = current;
                        small = current;
                        }
                    }else{
                        if(big == null) {big = current;
                         firstBigNode= current;}
                        else {big.next = current;
                            big = current;
                        }
                    }
                    current = current.next;
                }
                if(small == null) {
                    big.next = null;
                    head = firstBigNode;
                }
                else if(big == null) {

                }else {
                    head = firstSmallNode;
                    big.next = null;
                    small.next = firstBigNode;
                }
            }
        }

    }
