package org.javaexample.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {
    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();
        que.offer("int");
        que.offer("double");
        que.offer("string");

        System.out.println("next: " + que.peek());
        System.out.println("next: " + que.peek());

        System.out.println("꺼낸 것: " + que.poll());
        System.out.println("꺼낸 것: " + que.poll());

        System.out.println("next: " + que.peek());
//        System.out.println("꺼낸 것: " + que.poll());

        System.out.println(que.toString());

        System.out.println("-----------------------------------");


        Deque<String> deque1 = new ArrayDeque<>();
        Deque<String> deque2 = new LinkedList<>();

        deque1.offerFirst("Integer1");
        deque1.offerFirst("Integer2");
        deque2.offerFirst("Double1");
        deque2.offerFirst("Double2");

        System.out.println(deque1.peek());
        System.out.println(deque2.peek());

        deque1.poll();
        deque2.poll();

        System.out.println(deque1);
        System.out.println(deque2);

    }
}
