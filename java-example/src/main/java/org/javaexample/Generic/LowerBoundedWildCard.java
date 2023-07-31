package org.javaexample.Generic;

class BigBox<T> {
    private T ob;
    public T getOb() {
        return ob;
    }
    public void setOb(T ob) {
        this.ob = ob;
    }
    @Override
    public String toString() {
        return ob.toString();
    }
}
class UpperBox {
    public static <T extends Number> T methodBox1(BigBox<T> box) {
        T ob = box.getOb();
        System.out.println("하한 제한");
        return ob;
    }
}
class LowerBox {
    public static void methodBox2(BigBox<? super Integer> box) {
        System.out.println("상한제한 & "+box);
    }
}
public class LowerBoundedWildCard {
    public static void main(String[] args) {
        BigBox<Integer> box1 = new BigBox<>();
        box1.setOb(Integer.valueOf(10000));
        UpperBox.methodBox1(box1);
        Integer integer = UpperBox.methodBox1(box1);
        System.out.println(integer);
        integer.toString();
        LowerBox.methodBox2 (box1);
        
        BigBox<Object> box2 = new BigBox<>();
        box2.setOb("object");
        LowerBox.methodBox2(box2);

        BigBox<Number> box3 = new BigBox<>();
        Integer integer1 = Integer.valueOf(5);
        box3.setOb(integer1.intValue());
        System.out.println(box3.getOb());


    }

}
