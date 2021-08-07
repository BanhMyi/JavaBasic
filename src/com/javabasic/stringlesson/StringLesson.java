package com.javabasic.stringlesson;


import java.util.LinkedList;

public class StringLesson {
    public static void main(String[] args) {

        String s = "ToiYeuDaNang";
        String first = "Toi";
        first.concat("Yeu").concat("Da").concat("Nang");
        System.out.println("Vi tri ky tu a: " + s.indexOf("a") + ", " + s.lastIndexOf("a"));
        System.out.println("tach chuoi: " + s.substring(0, 3) + ", "
                    + s.substring(3, 6) + ", " + s.substring(6, 8) + ", " + s.substring(8));

        LinkedList<StringLesson> a = new LinkedList<>();
    }
}
