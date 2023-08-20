package org.javaexample;

import java.util.Scanner;

class ReadAgeException extends Exception{
    String s;
    ReadAgeException(String s) {
        super("잘못된 나이 입력");
//        super(s);
    }
}
public class UserException {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("나이 입력: ");
        try {
            int age = readAge();
        } catch (ReadAgeException exception) {
            System.out.println(exception.getMessage());
            exception.printStackTrace();
        }
    }
    public static int readAge() throws ReadAgeException {
        int age = sc.nextInt();
        if (age <= 0) {
            throw new ReadAgeException("테스트용");
        }
        return age;
    }
    }

