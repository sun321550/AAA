package com.sun.stringclass;

public class StringDemo03 {
    public static void main(String[] args) {
        //0 1 2 3 4 56789012345    
        String str = "thinking in java";
        //查询10 的字符是什么
        char c = str.charAt(10);
        System.out.println("c = "+ c);
        int length = str.length();
        System.out.println("length = " + length);
        char[] chars = str.toCharArray();//对数组的加密
        int x = chars.length;
        System.out.println("x = " + x);
        for(char aChar : chars){
            System.out.println("aChar = " + aChar);

        }
        //查找给定的字符串的位置
        //如 查找in的位置 查找出来的是第一次出现的位置
        int i= str.indexOf("in");
        System.out.println("i = " + i);
        int i1 = str.indexOf("in",3);
        System.out.println("i1 = " + i1);
        int is2 = str.lastIndexOf("in");
        System.out.println("is2 = " + is2);

        String str1 = "thinking in java";//java编程思想
        //判断 是否 以什么字符开头，以什么字符结尾
        boolean th = str1.startsWith("th1111");
        System.out.println("th = " + th);
        boolean va = str1.endsWith("va");
        System.out.println("va = " + va);

        String str2 = "www.oracle.com";
        //String substring(int beginIndex, int endIndex)截取字符串
        //含头不含尾
        String  substring = str2.substring(4,10);
        System.out.println("substring = " + substring);
        // 一下子 截取末尾
        String substring1 = str2.substring(4);
        System.out.println("substring1 = " + substring1);
        String str3 = "  赵 书 坤  ";
        String trim = str3.trim();
        System.out.println("trim = " + trim); // trim 只能删除字符串2边空格, 不能删除中间的
        String m = "ABC";
        String m1 = m.toLowerCase();
        System.out.println("m1 = " + m1);
        String n = "abc";
        String n1 = n.toUpperCase();
        System.out.println("n1 = " + n1);
        System.out.println( m.equals(n));//false
        System.out.println(m.equalsIgnoreCase(n)); //true 忽略大小写, 验证码专用

        // 把 数字转换成字符串
        int u=110;
        String s = String.valueOf(u);
        System.out.println("s = " + s+1);
        //练习
        //假设 大数据获取了 很多网站，我想要 www ----com 之间的内容
        //有一下 几类网址
        //www .oracle.com ---->oraclel
        // .www.oracle.com.cn. . ---->. oracle
        //www.java.oracle.com.cn----> java.oracle
        // www.lol.game.qq.com.cn ----> lol.game.qql
        // www.game.163.com.cn.----> .game.163

    }

}
