package com.sun.stringclass;

/*
 * String 类的使用
 * */
public class StringDemo01 {
    public static void main(String[] args) {
        //针对面试
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1==s2); //true
        //原因:以上为什么是true？因为s2 重用了 s1的对象
        s1 = s1 + "!";
        System.out.println(s1==s2); //false
        //原因:以上为什么是false?因为 1.根本不想等 2.深层原因
        String s3 = "a" + "bc";
        System.out.println(s2==s3);  //true
        //原因:字符串的连接 就等于没连接
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s2==s4); //false
        //原因:s2 是常量池中的字符串 而new String是类
        System.out.println(s4);
        System.out.println(s4==s5);  //false
        //原因:s4 和 s5 是不同的对象
        System.out.println(s4.equals(s5));  //true
        System.out.println(s4.equals(s2));  //true
        //原因: == 比较的是 内存地址 equals 比较的是 两者是否相同
        // 例子: 有两对长的一样的双胞胎, == 比较的是DNA
    }
}
