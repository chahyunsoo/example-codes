package org.javaexample.Generic;

class Apple extends Box{
    public String toString(){
        return "Apple";
    }
}
class Orange{
    public String toString(){
        return "Orange";
    }
}

class Box {
    private String object;

    public void set(String o) {
        this.object = o;
    }
    public Object get() {
        return this.object;
    }
}
public class BeforeGeneric {
    public static void main(String[] args) {
        Box abox = new Box();
        Box bbox = new Box();

        abox.set("firstA");
        bbox.set("secondB");

//        Apple apple = (Apple) abox.get();
//        Orange orange = (Orange) bbox.get();

//        Object apple = (Object) abox.get();
//        Object orange = (Object) bbox.get();

        String apple=(String)abox.get();
        String orange=(String)bbox.get();

        System.out.println(apple);
//        System.out.println(orange);

    }
}
