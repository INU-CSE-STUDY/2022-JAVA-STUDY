package inu.cse.ch07.uuuo3o;

class Point3D2 extends Point {
    int z = 30;

    Point3D2() {
        this(100, 200, 300);
    }

    Point3D2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class PointTest2 {
    public static void main(String[] args) {
        Point3D2 p3 = new Point3D2();
        System.out.println("p3.x = " + p3.x);
        System.out.println("p3.y = " + p3.y);
        System.out.println("p3.z = " + p3.z);
    }
}