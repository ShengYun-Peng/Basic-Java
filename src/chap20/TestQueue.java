package chap20;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Oklahoma");
        queue.offer("Indiana");
        queue.offer("Georgia");
        queue.offer("Texas");

        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }
        System.out.println();
    }
}
