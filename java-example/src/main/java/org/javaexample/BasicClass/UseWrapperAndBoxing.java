package org.javaexample.BasicClass;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;
/*

```java
Integer num = null;
int unboxedNum = num; // NullPointerException 발생
```
래퍼 클래스의 객체가 null일 경우, 오토 언박싱 과정에서 NullPointerException이 발생할 수 있음
위의 코드에서 Integer 객체 num이 null이지만, 오토 언박싱 과정에서 int형 변수 unboxedNum에 할당하려 하므로 NullPointerException이 발생.
이를 피하려면 null 체크를 반드시 해줘야함

 */
public class UseWrapperAndBoxing {
    public static void main(String[] args) {
        String str = "12";
        String str1 = "false";
        String str2 = "true";

        Boolean bool = Boolean.valueOf(str);
        Boolean bool1 = Boolean.valueOf(str1);
        Boolean bool2 = Boolean.valueOf(str2);

        System.out.println(bool);
        System.out.println(bool1);
        System.out.println(bool2);


//        Integer integer1 = new Integer(5);  // deprecated, 자바9부터 사용 권장하지 않음
        Integer integer1 = Integer.valueOf(5);
        Integer integer2 = Integer.valueOf("1012");  //문자열 기반 Integer 인스턴스
        Double double2 = Double.valueOf(3.33); // Integer.valueof(int) 메소드를 사용, Boxing
        Double double3 = Double.valueOf(3);
        System.out.println("integer1 = " + integer1.toString());
        System.out.println("integer2 = " + integer2);
        System.out.println("double2 = " + double2);
        System.out.println("double3 = " + double3);

        boolean b = true;
        Boolean aBoolean = Boolean.valueOf(b);
        System.out.println(aBoolean.toString());


        int num1 = integer1.intValue();  //UnBoxing
        double num2 = double2.doubleValue();
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //Wrapper 클래스의 인스턴스들은 immutatble(값을 바꾸지 못하는,새로운 인스턴스를 만듬) 인스턴스(ex. String 인스턴스)
        //값을 바꾸려면 UnBoxing하고 -> 증가시키고 -> 새로운 인스턴스를 만듬
        integer1 = Integer.valueOf(integer1.intValue() + 10);   //integer1 = new Integer(integer1.intValue() + 10);
        System.out.println("Increased integer1 = " + integer1);
        integer1++;
        System.out.println("Increased integer1 = " + integer1);
        System.out.println("10의 2진수: " + Integer.toBinaryString(10));
        System.out.println("10의 8진수: " + Integer.toOctalString(10));
        System.out.println("10의 16진수: " + Integer.toHexString(10));

        BigInteger big1 = new BigInteger("1000000000000000000000");
        BigInteger big2 = new BigInteger("-999999999999999999999");
        BigInteger big3 = big1.add(big2);
        System.out.println(big3.toString());

        int bigNum = big3.intValueExact();
        System.out.println(((Object) bigNum).getClass().getName());
        System.out.println(((Object)big3.intValueExact()).getClass().getName());


        BigDecimal bd1 = new BigDecimal(1.6);  //오차가 존재
        BigDecimal bd2 = new BigDecimal("1.6");//오차 허용X
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(((Object) bd1).getClass().getName());

        Random random = new Random();
        Random randomSeed1 = new Random (10); //seed 값
        Random randomSeed2 = new Random(20 ); //seed 값
        for (int i = 0; i < 7; i++) {
            System.out.print(randomSeed1.nextInt(10) + 10 + "  ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(randomSeed2.nextInt(10) + 10 + "  ");
        }

    }

}

class Wrapper {
    public static void print(Object object) {
        System.out.println(object);
    }
}

