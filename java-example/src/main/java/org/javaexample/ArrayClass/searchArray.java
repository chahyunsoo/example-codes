package org.javaexample.ArrayClass;

public class searchArray {
    public static void main(String[] args) {
//        //기본 자료형 값일때 배열 탐색
//        int[] arr = {11, 44, 22, 55, 99, 33};
//        Arrays.sort(arr);
//        for (int n : arr) {
//            System.out.print(n+" ");
//        }
//        System.out.println();
//        System.out.println(Arrays.binarySearch(arr,33));

        //인스턴스 대상일때
        SearchInstance[] si = new SearchInstance[4];
        si[0] = new SearchInstance("park", 0);
        si[1] = new SearchInstance("lark", 10);
        si[2]= new SearchInstance("park", 20);
        si[3] = new SearchInstance("jark", 30);

        System.out.println(si[0].compareTo(si[1]));  //-1
        System.out.println(si[0].compareTo(si[2]));  //-1
        System.out.println(si[0].compareTo(si[3]));  //-1
//        System.out.println(si[2].compareTo(si[0]));  //20
//        System.out.println(si[3].compareTo(si[1]));  //-1

        System.out.println();
        si[0].compareAll(si);

    }
}

class SearchInstance implements Comparable<SearchInstance> {
    private String name;
    private int id;

    public SearchInstance(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /*
    compareTo는 두 객체를 비교하는데 사용
    현제 개체('this')와 매개변수로 들어온 객체를 비교함
    배열을 매개변수로 받는것은 compareTo 메소드의 목적에 맞지 않음
    compareTo 메소드 인자로 SearchInstance[] sI가 들어오면 안된다는 소리

    */
    @Override
    public int compareTo(SearchInstance sI) {  // (Object obj)
//        searchInstance searchInstance = (searchInstance) obj;
        SearchInstance searchInstance  = sI;
        int compareName = this.name.compareTo(searchInstance.name);
        if (compareName == 0) {
            return this.id - searchInstance.id;
        } else return -1;
    }

    //인자로 전달된 배열 전체와 compareTo 메소드를 수행하게 함
    public void compareAll(SearchInstance[] instances) {
        for (SearchInstance instance : instances) {
            System.out.println(this.compareTo(instance));
        }
    }
}