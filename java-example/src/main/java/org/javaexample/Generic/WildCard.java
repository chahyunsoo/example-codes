package org.javaexample.Generic;

class Boxx<T> {
    private T ob;

    public void set(T o) {
        ob = o;
    }

    public T get() {
        return ob;
    }
    @Override
    public String toString() {
        return ob.toString();
    }
}

class Unboxer {

    public static <T> T openBox(Boxx<T> box) {
        return box.get();
    }

    public static <T> void peekBox(Boxx<T> box) {
        System.out.println(box);
    }
}

public class WildCard {
    public static void main(String[] args) {
        Boxx<Integer> box = new Boxx<>();
        box.set(Integer.valueOf(40));
        Unboxer.peekBox(box);
    }
}


