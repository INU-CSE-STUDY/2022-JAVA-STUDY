package inu.cse.ch14.hgyellow;

interface MyFunction1 {
    void run();
}

public class LambdaEx1 {
    static void execute(MyFunction1 f) {
        f.run();
    }

    static MyFunction1 getMyFunction() {
        MyFunction1 f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        MyFunction1 f1 = () -> System.out.println("f1.run()");

        MyFunction1 f2 = new MyFunction1() {
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction1 f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run()"));
    }
}
