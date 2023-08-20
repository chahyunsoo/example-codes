package org.javaexample.InnerClass;

import java.util.*;

class AnonymousComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java"); list.add("python"); list.add("c"); list.add("c++");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };
        Collections.sort(list,cmp);
        System.out.println(list);
        System.out.println(list.toString());
    }


}
