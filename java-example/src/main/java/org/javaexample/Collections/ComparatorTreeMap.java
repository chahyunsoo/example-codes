package org.javaexample.Collections;

import javax.swing.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class AgeComparator implements Comparator<Integer> {
    public int compare(Integer n1, Integer n2) {
        return n2.intValue() - n1.intValue(); //내림차순
//        return n1.intValue() - n2.intValue(); //내림차순
    }
}
public class ComparatorTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
        map.put(1, "A1");
        map.put(2, "A2");
        map.put(3, "A3");
        map.put(4, "A4");

        Set<Integer> set = map.keySet();
        for (Iterator<Integer> itr = set.iterator(); itr.hasNext(); ) {
            System.out.println("key = " + itr.next()) ;
        }
        System.out.println();

        for (Integer i : set) {
            System.out.println("for-each: "+map.get(i));
        }
        System.out.println();

        for (Iterator<Integer> itr = set.iterator(); itr.hasNext(); ) {
            System.out.println("map.get(itr) = " + map.get(itr));  //오류, get() 메소드 안에는 키 값이 와야 함
            System.out.println("iterator "+map.get(itr.next()));
        }
        System.out.println();


    }
}
