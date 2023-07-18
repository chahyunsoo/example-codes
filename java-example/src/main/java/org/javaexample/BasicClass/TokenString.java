package org.javaexample.BasicClass;

import java.util.StringTokenizer;

public class TokenString {
    public static void main(String[] args) {
        //구분자가 무엇이냐에 따라서 토큰의 갯수가 달라짐
        StringTokenizer stringTokenizer = new StringTokenizer("PM:09:00","M:");
        System.out.println(stringTokenizer.hasMoreTokens());

        while (stringTokenizer.hasMoreTokens()) {
            System.out.print(stringTokenizer.nextToken()+" ");
        }
    }
}
