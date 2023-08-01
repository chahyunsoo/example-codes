package org.javaexample.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AsListCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("car1", "car2", "car3", "car4");
        list = new ArrayList<>(list);

        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            String str = itr.next();
            System.out.println(str);
        }
        System.out.println();
        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            String str = itr.next();
            if (str.equals("car3")) {
                itr.remove();
            }
        }
        System.out.println();
        for (Iterator<String> itr = list.iterator(); itr.hasNext(); ) {
            String str = itr.next();
            System.out.println(str);
        }
    }
}
