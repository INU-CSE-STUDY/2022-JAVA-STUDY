package inu.cse.ch12.hgyellow;

public class AnnotationEx2 {
    public static void main(String args[]) {
        NewClass1 nc = new NewClass1();

        nc.oldField = 10;
        System.out.println(nc.getOldField());
    }
}

class NewClass1 {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}