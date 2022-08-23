package inu.cse.ch11.uuuo3o;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() * 45) + 1;
            set.add(new Integer(num));
        }

        List list = new LinkedList(set);
        Collections.sort(list);     // 크기 순으로 정렬하기 위해 Collections 클래스의 sort 사용
        System.out.println(list);
    }
}
