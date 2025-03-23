package LinkedListExercises;

public class Main {
    public static void main(String[] args) {
        LinkedList newLL = new LinkedList(4);
        newLL.append(5);
        newLL.printAll();
        System.out.println(newLL.removeLast().value);
        newLL.printAll();
        System.out.println(newLL.removeLast().value);
        newLL.printAll();
        System.out.println(newLL.removeLast());
        newLL.printAll();
    }
}
