package org.javaexample.Collections;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("tom", "park", "kim");
        list = new ArrayList<>(list);
//        System.out.println(list.toString());
        System.out.println(list);

        Collection<Integer> collection = Arrays.asList(1, 2, 3);
        ArrayList<Integer> arrayList = new ArrayList<>(collection);
        System.out.println(arrayList);
    }
}
