package org.javaexample.Collections;

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
    }
}
