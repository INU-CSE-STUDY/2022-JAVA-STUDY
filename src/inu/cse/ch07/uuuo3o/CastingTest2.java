package inu.cse.ch07.uuuo3o;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        FireEngine fe = null;

        car.drive();
//        fe = (FireEngine) car; // 컴파일은 되지만 실행 시 에러가 발생
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
