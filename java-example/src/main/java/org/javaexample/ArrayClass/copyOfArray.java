package org.javaexample.ArrayClass;

import java.util.Arrays;

public class copyOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        //배열 전체를 복사
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        //세번째 요소까지만 복사
        int[] arr2 = Arrays.copyOf(arr, 3);
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println();
        int[] copy = new int[3];
        System.arraycopy(arr, 2, copy, 0,3); //arr배열 인덱스 2에서 copy배열 인덱스 0으로 요소 3개를 복사함
        for (int k : copy) {
            System.out.println(k);
        }

        System.out.println();
        int[] ar = {1, 2, 3, 4, 5, 10000, 6, 7};
        int[] ar2 = new int[4];
        System.arraycopy(ar,5,ar2,2,1);
        for (int d : ar2) {
            System.out.println(d);
        }

        System.out.println();
        //배열 내용 비교(참조값 비교가 아님)
        int[] array = {1, 2, 3};
        int[] newarray = Arrays.copyOf(array, 1);
        int[] newarray2 = Arrays.copyOf(array, array.length);
        System.out.println(Arrays.equals(array, newarray));  //f
        System.out.println(Arrays.equals(array, newarray2)); //t


    }
}
