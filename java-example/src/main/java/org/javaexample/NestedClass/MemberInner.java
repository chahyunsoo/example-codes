package org.javaexample.NestedClass;

class Outer {
    private int num=0;

    class Member {
        void add(int n) {
            num += n;
        }
        int get() {
            return num;
        }
    }
}
class MemberInner {
    public static void main(String[] args) {
        Outer o1 = new Outer();
        Outer.Member o1member = o1.new Member();

        o1member.add(4);
    }
}
