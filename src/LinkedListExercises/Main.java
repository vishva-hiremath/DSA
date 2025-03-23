package LinkedListExercises;

public class Main {
    public static void main(String[] args) {
        LinkedList newLL = new LinkedList(4);
        newLL.append(5);
        newLL.append(7);
        System.out.println(newLL.set(1, 10));
        newLL.printAll();
    }
}
