package org.javaexample.ObjectClass;
/*
오버라이딩된 clone 메소드를 보면, 사실상 오버라이딩의 의미가 없어보인다..
추가된 기능은 아예 없고 Object 클래스의 clone 메소드에서 반환 되는걸 다시 그대로 반환하는 역할 만하게 코드를 짰다

그럼 왜 오버라이딩 하냐?
-> Object클래스에서 clone 메소드는 'protected'로 선언이 되어 있어서 외부에서 호출이 불가능함
   그래서 어디서나 호출이 가능하게 하기 위해서 public으로 바꿔준 것 (protected -> public으로 넓히는 것만 가능)

참고, Object 패키지는 다른 패키지에 존재(java.lang) -> Point가 속해있는 패키지랑 Object가 속해있는 패키지가 다르니까
                                              protected로 해버리면 호출이 불가능

clone 메소드는 Native Method 이다.
 */
public class InstanceCloning {
    public static void main(String[] args) {
        Point p = new Point(1, 4);
        try {
            Point secondpoint = new Point(10, 11);
            Point thirdpoint = (Point)secondpoint.clone();

            System.out.println(p);
            System.out.println(secondpoint);
            System.out.println(thirdpoint);
        } catch (CloneNotSupportedException closedByInterruptException) {
            closedByInterruptException.printStackTrace();
        }

    }
}
class Point implements Cloneable { //clone 메소드 호출을 허용함
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return String.format("이 점은 %d ,%d\n", x, y);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

//    직접 try-catch 넣은 것
//    @Override
//    public Point clone() {
//        try {
//            return (Point) super.clone();
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError(); // Can't happen
//        }
//    }
}
