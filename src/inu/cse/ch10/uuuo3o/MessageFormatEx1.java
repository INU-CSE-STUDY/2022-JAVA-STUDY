package inu.cse.ch10.uuuo3o;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object[] argument = {"이자바", "02-123-1234", "27", "07-09"};

        String result = MessageFormat.format(msg, argument);
        System.out.println(result);
    }
}
