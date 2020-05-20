import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // custom queue
        CustomQueue q = new CustomQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());


        q.enqueue(-10);
        q.enqueue(-20);
        q.enqueue(-30);

        System.out.println(q.dequeue());

        Queue<Integer> q1 = new LinkedList<>();

        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        q1.add(60);

        System.out.println(q1.remove());

        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1.size());
        System.out.println(q1.element());


    }
}
