package com.sun;

public class Text {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String str1 = "  Hello   ";
        test1(str);
        //以下自行调用test2,test3...等方法。
        test2(str);
        test3(str);
        test4(str);
        test5(str);
        test6(str1);
        test7(str);
        test8(str);
        test9(str);
    }

    public static void test1(String str){
        System.out.println("Sun:"+str.length());
    }

    public static void test2(String str){
        System.out.println("index of 'o':"+str.indexOf('o'));
    }

    public static void test3(String str){
        System.out.println("index of 'o':"+str.indexOf('o',5));
    }

    public static void test4(String str){
        System.out.println("sub:"+str.substring(0, 5));
    }

    public static void test5(String str){
        System.out.println("sub:"+str.substring(5));
    }

    public static void test6(String str){
        System.out.println("trim:"+str.trim());
    }

    public static void test7(String str){
        System.out.println("charAt:"+str.charAt(5));
    }

    public static void test8(String str){
        System.out.println("startsWith:"+str.startsWith("h"));
        System.out.println("endsWith:"+str.endsWith("ld"));
    }

    public static void test9(String str){
        System.out.println("upper:"+str.toUpperCase());
        System.out.println("lower:"+str.toLowerCase());
    }

}
