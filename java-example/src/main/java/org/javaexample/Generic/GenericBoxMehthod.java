package org.javaexample.Generic;

class Box1<T> {
    private T ob;

    public T get() {
        return ob;
    }

    public void set(T ob) {
        this.ob = ob;
    }
    public String toString() {
        return String.format("hola!");
    }
}

class BoxMehtod {
    public static <T> Box1<T> makeBox(T ob) {
        Box1<T> box=new Box1<T>();
        box.set(ob);
        return box;
    }
}
public class GenericBoxMehthod {
    public static void main(String[] args) {
//        Box1<T> bBox = new Box1<T>();
        Box1<String> bBox = BoxMehtod.makeBox("mucho gusto");
        System.out.println(bBox.get());
        System.out.println(bBox);
    }
}
