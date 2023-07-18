package org.javaexample.ArrayClass;

import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
//        int[] arr = {100 , 43, 13, 34};
//        Arrays.sort(arr);
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        System.out.println();

        compareClass compareClass1 = new compareClass(7);
        compareClass compareClass2 = new compareClass(11);
        compareClass compareClass3 = new compareClass(15);
        compareClass compareClass4 = new compareClass(15);

        int[] compareArray = new int[4];
        compareArray[0]=compareClass2.compareTo(compareClass1);  //1 , 4
        compareArray[1]=compareClass1.compareTo(compareClass3);  //-1, -8
        compareArray[2]=compareClass2.compareTo(compareClass3);  //-1, 0
        compareArray[2]=compareClass4.compareTo(compareClass3);  //0, 0

        for (int i : compareArray) {
            System.out.println(i);
        }
        System.out.println();
        Arrays.sort(compareArray);
        for (int i : compareArray) {
            System.out.println(i);
        }
    }
}
class compareClass implements Comparable {
    private int id;

    public compareClass(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object obj) {
        compareClass compareClass = (compareClass) obj;
//        if (this.id >compareClass.id) {
//            return 1;
//        } else if (this.id < compareClass.id) {
//            return -1;
//        } else return 0;
        return this.id - compareClass.id;
    }

    @Override
    public String toString() {
        return String.format("id :" + id);
    }
}
