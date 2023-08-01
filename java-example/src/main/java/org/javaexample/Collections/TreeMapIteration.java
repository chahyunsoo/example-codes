package org.javaexample.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapIteration {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(10, "cha");
        map.put(20, "hyun");
        map.put(30, "soo");

        //key만 담고 있는 컬렉션 인스턴스
        //Set은 중복허용 안되니까 Set으로 key를 담는게 나을듯
        Set<Integer> set = map.keySet();

        for (Integer i : set) {
            System.out.println(i);
        }
        System.out.println();

        for (Integer i : set) {
            String s = map.get(i).toString();
            System.out.println(s);
        }
        System.out.println();

        for (Iterator<Integer> itr = set.iterator(); itr.hasNext(); ) {
            System.out.println(map.get(itr.next()));
        }
    }
}
