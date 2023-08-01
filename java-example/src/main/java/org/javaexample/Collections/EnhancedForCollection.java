package org.javaexample.Collections;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

class EnhancedForCollection {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("Toy");
        list.add("Box");
        list.add("Robot");
//        list.remove(0);
        for(String s : list)
            System.out.print(s + '\t');
        System.out.println();

        Iterator<String> itr = list.iterator(); //iteratr()호출하면 반복자를 return
        while (itr.hasNext()) {
            String next = itr.next();
            System.out.println(next);
        }
    }
}