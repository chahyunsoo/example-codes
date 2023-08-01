package org.javaexample.Collections;

import java.util.ArrayDeque;
import java.util.Deque;

interface DIStack<E> {
    public boolean push(E item);
    public E pop();

    public String toString();
}

class DCStack<E> implements DIStack<E> {
    private Deque<E> deque;

    public DCStack(Deque<E> deque) {
        this.deque = deque;
    }
    @Override
    public boolean push(E item) {
        return deque.offerFirst(item);
    }
    @Override
    public E pop() {
        E item = deque.pollFirst();
        return item;
    }

    @Override
    public String toString() {
        return deque.toString();
    }
}
public class DefinedStack {
    public static void main(String[] args) {
        DIStack<String> stack = new DCStack<>(new ArrayDeque<>());

        //push
        stack.push("Box1");
        stack.push("Box2");
        stack.push("Box3");
        stack.push("Box4");

        //pop
        stack.pop();
        stack.pop();

        System.out.println(stack);


    }
}
