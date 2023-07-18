package org.javaexample.ObjectClass;

public class ShallowCopy {
    public static void main(String[] args) {
        try {
            shallowRectangle srt1 = new shallowRectangle(10, 20, 30, 40 );
            shallowRectangle srt2 = new shallowRectangle(100, 200, 300, 400);
            shallowRectangle copy = srt1.clone();
            System.out.println("srt1: "+ srt1);
            System.out.println("copied: "+ copy);
            System.out.println("new one: "+ srt2);
            srt2.movePoint(0,0,0,0);
            System.out.println("modified one: "+ srt2);

        } catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
        }
    }
}

class shallowPoint implements Cloneable {
    private int x1;
    private int y1;


    public shallowPoint(int spx, int spy) {
        this.x1 = spx;
        this.y1 = spy;
    }
    public String toString() {
        return String.format("%d,%d", x1, y1);
    }
}

class shallowRectangle implements Cloneable {

    private shallowPoint upperLeft;
    private shallowPoint lowerRight;

    public shallowRectangle(int spx1, int spy1, int spx2, int spy2) {
        this.upperLeft = new shallowPoint(spx1, spy1);
        this.lowerRight = new shallowPoint(spx2, spy2);
    }

    @Override
    public shallowRectangle clone() throws CloneNotSupportedException {  //메소드 반환형 Object도 가능
        shallowRectangle newSrt = (shallowRectangle) super.clone(); //복제 완료
        return (shallowRectangle) newSrt;
    }

    public void movePoint(int x1, int y1, int x2, int y2) {
        this.upperLeft = new shallowPoint(x1, y1);
        this.lowerRight = new shallowPoint(x2, y2);
    }

    @Override
    public String toString() {
        return "upperLeft: " + upperLeft.toString() + " lowerRight: " + lowerRight.toString();
    }
}
