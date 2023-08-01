package org.javaexample.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("car1");
        list.add("car2");
        list.add("car3");
        list.add("car4");

        Iterator<String> itr = list.iterator(); //반복자 획득, irt 지팡이를 참조

        while (itr.hasNext()) {
            System.out.print(itr.next()+"\t");
        }
        System.out.println();

        itr = list.iterator(); //반복자 갱신
        String find = "car3";
        while (itr.hasNext()) {
            find = itr.next();
            if (find == "car3") {
                itr.remove();
            }
        }
        System.out.println();

        //삭제 후 결과 확인용
        itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+"\t");
        }
        System.out.println();
    }
}
