package org.javaexample;

class Box<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
}

class A {
    public static <T> Box<T> makeBox() {
        Box<T> box = new Box<>();
        return box;
    }
}

public class TargetTypes {
    public static void main(String[] args) {
        Box<Integer> ibox = A.<Integer>makeBox();
        ibox.set(25);
        System.out.println(ibox.get());
    }
}



