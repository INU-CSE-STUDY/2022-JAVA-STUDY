package inu.cse.ch07.uuuo3o;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A3 a = new A3();
        a.methodA();
    }
}

class A3 {
    void methodA() {
        I2 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

class B3 implements I2 {
    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }

    public String toString() { return "class B"; }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B3();
    }

}

interface I2 {
    public abstract void methodB();
}
