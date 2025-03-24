package LinkedListExercises;

public class Main {
    public static void main(String[] args) {
        LinkedList newLL = new LinkedList(1);
        newLL.append(2);
        newLL.append(3);
        //System.out.println(newLL.remove(1));
        newLL.reverse();
        newLL.printAll();
    }
}
