package inu.cse.ch11.uuuo3o;

import java.util.Properties;

public class PropertiesEx4 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version: " + sysProp.getProperty("java.version"));
        System.out.println("user.language: " + sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
