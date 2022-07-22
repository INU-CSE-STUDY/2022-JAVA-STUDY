package inu.cse.ch08.uuuo3o;

public class ExceptionEx1 {
    public static void main(String[] args) {
        try {
            try { } catch (Exception e) { }
        } catch (Exception e) {
            try { } catch (Exception e1) { }
        }

        try {

        } catch (Exception e) {

        }
    }
}
