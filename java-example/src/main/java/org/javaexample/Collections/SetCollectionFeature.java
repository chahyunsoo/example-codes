package org.javaexample.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectionFeature {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("E");
        set.add("E"); //중복 허용 X
        System.out.println(set.size());

        //반복자
        for (Iterator<String> itr = set.iterator(); itr.hasNext(); ) {
            String next = itr.next();
            System.out.println("next = " + next);
        }

        //for-each
        for (String s : set) {
            System.out.println(s);
        }
    }
}
