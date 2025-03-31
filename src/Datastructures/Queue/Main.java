package Datastructures.Queue;

public class Main {
    public static void main(String[] args) {
    Queue q = new Queue(6);
    q.enqueue(1);
    q.enqueue(2);
    q.printQueue();
    System.out.println("Removed Value: " + q.dequeue().value);
    q.printQueue();
    }
}
