package chap20;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Oklahoma");
        queue1.offer("Indiana");
        queue1.offer("Georgia");
        queue1.offer("Texas");

        for (String s : queue1)
            System.out.print(s + " ");
        System.out.println();

        PriorityQueue<String> queue2 = new PriorityQueue<>(5, Collections.reverseOrder());
        queue2.offer("Oklahoma");
        queue2.offer("Indiana");
        queue2.offer("Georgia");
        queue2.offer("Texas");

        while (queue2.size() > 0) {
            System.out.print(queue2.poll() + " ");
        }
        System.out.println();
    }
}
