package org.javaexample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("first:");
//            int a = sc.nextInt();
//            System.out.println("second:");
//            int b = sc.nextInt();
//            int c = a / b;
//            System.out.println("c = " + c);
//        } catch (ArithmeticException exception) {
////            exception.printStackTrace();
//
//            String a = exception.getMessage();
//            System.out.println("getmeesage:" + a);
//
//        }

        try {
            md1(3);
        } catch (Throwable throwable) {
//            throwable.printStackTrace();
            System.out.println(throwable.getMessage());
        }
    }

    public static void md1(int n1) {
        md2(n1, 0);
    }

    public static void md2(int n1, int n2) {
        int r = n1 / n2;
    }

}
