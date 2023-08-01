package org.javaexample.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1); treeSet.add(2); treeSet.add(3); treeSet.add(4);
        System.out.println("인스턴스 갯수:" + treeSet.size());

        //for-each
        for (Integer n : treeSet) {
            System.out.print(n.toString()+" ");
        }
        System.out.println();

        //iterator
        int n;
        for (Iterator<Integer> itr = treeSet.iterator(); itr.hasNext(); ) {
            n = itr.next();
            System.out.print(n+" ");
        }
     }
}
