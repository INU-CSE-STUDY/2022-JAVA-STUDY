package inu.cse.ch06.uuuo3o;

class Data4 {
    int value;
}

class Data5 {
    int value;

    Data5(int x) {
        value = x;
    }
}
public class ConstructorTest {
    public static void main(String[] args) {
        Data4 d1 = new Data4();
        // Data5 d2 = new Data5(); // 에러 발생
    }
}
