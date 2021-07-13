package com.sun;

public class Text2 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("大家好!");
        builder.append("我是程序员!");
        System.out.println(builder.toString());
        builder.insert(6,"优秀的");
        System.out.println(builder.toString());
        builder.replace(6, 8, "牛牛");
        System.out.println(builder.toString());
        builder.delete(0, 4);
        System.out.println(builder.toString());

    }
}
