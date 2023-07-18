package org.javaexample;

public class EqualsProblem {
    public static void main(String[] args) {
        Rectangle rc1 = new Rectangle(10, 40, 40, 50);
        Rectangle rc2 = new Rectangle(10, 40, 10, 40);
        Rectangle rc3 = new Rectangle(10, 40, 10, 40);

        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);
        Point p3 = new Point(10, 40);

        boolean result1 = rc1.equals(rc2);
        boolean result2 = rc2.equals(rc3);

        boolean result3 = p1.equals(p2);
        boolean result4 = p2.equals(p3);

        System.out.println(result1); //f
        System.out.println(result2); //t
        System.out.println(result3); //t
        System.out.println(result4); //f

    }
}

class Point {
    private int xpos;
    private int ypos;

    public Point(int x, int y) {
        this.xpos = x;
        this.ypos = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.xpos == ((Point)obj).xpos && this.ypos == ((Point)obj).ypos) {
            return true;
        } else {
            return false;
        }
    }
}

class Rectangle {
    private Point upperleft;
    private Point lowerright;

    public Rectangle(int x1, int y1, int x2, int y2) {
        upperleft = new Point(x1, y1);
        lowerright = new Point(x2, y2);
    }
    @Override
    public boolean equals(Object obj) {
        if (this.upperleft.equals(((Rectangle)obj).upperleft) && this.lowerright.equals(((Rectangle)obj).lowerright)) {
            return true;
        } else return false;
    }
}