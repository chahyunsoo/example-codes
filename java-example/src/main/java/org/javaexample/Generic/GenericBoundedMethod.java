package org.javaexample.Generic;

class Box2<T> {
    private T ob;
    public T get() {
        return ob;
    }
    public void set(T ob) {
        this.ob = ob;
    }
    public String toString() {
        return String.format("bye!");
    }
}
class BoxMethod2 {
    public static <T extends Number> Box2<T> makeBox(T ob) {
        Box2<T> box=new Box2<T>();
        box.set(ob);
        int n = ob.intValue();
        System.out.println(n);
        return box;
    }
}
public class GenericBoundedMethod {
    public static void main(String[] args) {
        Box2<Integer> bBox = BoxMethod2.makeBox(Integer.valueOf(1123412431));
        System.out.println(bBox.get());
        System.out.println(bBox);
    }
}
