package org.javaexample.Generic;

import java.lang.reflect.Method;
class BoxProblem<T> {
    private T ob;
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}
//class Factory {
//    public static <T extends Number> void SwapBox(BoxProblem<T> box1, BoxProblem<T> box2) {
//        T temp = box1.get();
//        box1.set(box2.get());
//        box2.set(temp);
//    }
//}
public class GenericProblem {
    public <T extends Number> void SwapBox(BoxProblem<T> box1, BoxProblem<T> box2) {
        T temp = box1.get();
        box1.set(box2.get());
        box2.set(temp);
    }
    public static void main(String[] args) {
        BoxProblem<Integer> box11 = new BoxProblem<>();
        box11.set(99);

        BoxProblem<Integer> box22 = new BoxProblem<>();
        box22.set(55);

        System.out.println(box11.get() + " & " + box22.get());  //99,55
        new GenericProblem().SwapBox(box11, box22);
        System.out.println(box11.get() + " & " + box22.get());  //55,99
    }
}
