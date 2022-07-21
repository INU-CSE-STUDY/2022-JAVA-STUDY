package inu.cse.ch07.uuuo3o;

public class InterfaceTest2 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());
        a.autoPlay(new C());
    }
}

class A2 {
    void autoPlay(I i) {
        i.play();
    }
}

class B2 implements I {
    @Override
    public void play() {
        System.out.println("play in B class");
    }
}

class C implements I {
    @Override
    public void play() {
        System.out.println("play in C class");
    }
}

interface I {
    public abstract void play();
}
