package org.javaexample;

class Person{
    String country;

    public Person(String country) {
        this.country = country;
    }
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Destroyed: " + country);
    }
}
public class ObjectFinalize {
    public static void main(String[] args) {
        Person p1 = new Person("Korea");
        Person p2 = new Person("Japan");
        p1 = null;
        p2 = null;

        System.gc();
        System.runFinalization();

        System.out.println("Enough");

    }
}
