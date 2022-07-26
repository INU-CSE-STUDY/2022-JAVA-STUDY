package inu.cse.ch09.uuuo3o;

public class StringEx7 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        // fullName에서 '.'의 위치를 찾음
        int index = fullName.indexOf('.');

        // fullName의 첫글자부터 '.'이 있는 곳까지 문자열 추출
        String fileName = fullName.substring(0, index);

        // '.'의 다음 문자부터 시작해 문자열의 끝까지 추출
        String ext = fullName.substring(index + 1); // fullName.substring(index + 1, fullName.length());

        System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
        System.out.println(fullName + "의 확장자는 " + ext);
    }
}
