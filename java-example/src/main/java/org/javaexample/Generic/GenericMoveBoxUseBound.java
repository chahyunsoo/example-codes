package org.javaexample.Generic;

class Animal<T> {
    private T ob;

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}
class Pet {
    @Override
    public String toString() {
        return "i am pet";
    }
}

class changeMethodClass {
    public static void changePet(Animal<? extends Pet> from, Animal<? super Pet> to) {
        to.setOb(from.getOb());
//        from.setOb(to.getOb()); //컴파일 오류~
    }
}

public class GenericMoveBoxUseBound {
    public static void main(String[] args) {
        Animal<Pet> animal1 = new Animal<>();
        animal1.setOb(new Pet());

        Animal<Pet> animal2 = new Animal<>();

        changeMethodClass.changePet(animal1, animal2);

        Pet ob = animal2.getOb();
        System.out.println(ob);
    }
}
