package org.javaexample.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PrimitiveCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        String n;
        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            n = itr.next(); //오토 언박싱을 진행함
            if (n.equals("D")) {
                itr.remove();
            }
        }
        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
//            int i = itr.next(); //오토 언박싱을 진행함
            String i = itr.next();
            System.out.println(i);
        }
    }
}
