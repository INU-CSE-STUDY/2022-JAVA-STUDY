package inu.cse.ch07.hgyellow;

public class PointTest {
    public static void main(String args[]) {
        Point3D p3 = new Point3D(1, 2, 3);
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation() {
        return "x :" + x + ", y :" + y + ", z :" + z;
    }
}
