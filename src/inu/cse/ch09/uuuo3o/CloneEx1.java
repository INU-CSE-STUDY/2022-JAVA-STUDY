package inu.cse.ch09.uuuo3o;

public class CloneEx1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point original = new Point(3, 5);
        Point copy = (Point) original.clone();

        System.out.println(original);
        System.out.println(copy);
    }
}

class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x = " + x + ", y = " + y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
