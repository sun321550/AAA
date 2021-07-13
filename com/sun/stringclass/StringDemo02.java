package com.sun.stringclass;

//测试 String 类的 性能 总结：频繁修改字符串，会造成性能损失，需要stringBuffer/Build
//频繁修改字符串 内存会溢出
public class StringDemo02 {
    public static void main(String[] args) {
        String str = "a";
        System.out.println(System.currentTimeMillis());
        long l = System.currentTimeMillis();
        for (int i = 0; i <30; i++) {
            str+=str;
            System.out.println("str = " + str);
        }
        System.out.println(System.currentTimeMillis()-l);
    }

}
