package org.javaexample.Generic;

class TBox<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}

class Toy {
    @Override
    public String toString() {
        return "I am a Toy";
    }
}
class BoxHandler {
    public static void outBox(TBox<? extends Toy> box) {
        Toy t = box.get();
//        box.set(new Toy());  //컴파일 오류남
        System.out.println(t);
    }

    public static void inBox(TBox<? super Toy> box, Toy n) {
        box.set(n);
//        Toy t= box.get(); 컴파일 오류
    }
}

public class GenericBoundedExtends {
    public static void main(String[] args) {
        TBox<Toy> tbox = new TBox<>();
        BoxHandler.inBox(tbox, new Toy());
        BoxHandler.outBox(tbox);
    }
}

