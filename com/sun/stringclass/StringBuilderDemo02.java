package com.sun.stringclass;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        String str = "a";
        StringBuilder sb = new StringBuilder(str);
        long l = System.currentTimeMillis();
        for (int i = 0; i <500 ; i++) {
            sb.append(str);
            System.out.println("str = " + str);


        }
        System.out.println(System.currentTimeMillis()-l);
    }
}
