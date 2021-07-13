package com.sun.stringclass;

/**StringBuilder（线程不安全，速度很快）,StringBuffer 解决字符串频繁修改的问题
 * 意思是吧String升级了
 * String 类 重点  重要性
 * StringBuiler / buffer 倾向于 对字符串的修改
 *
 */
/*
 *StringBuilder（线程不安全,速度很快），StringBuffer (线程安全,速度稍微慢)解决 字符串频繁修改的问题
 * 意思是把string升级了
 * String类 重点 重要性
 * StringBuilder，StringBuffer 倾向于 对字符串的修改
 * 当用到字符大量的，追加/修改/删除的时候，就使用StringBuilder，StringBuffer
 *stringBuilder的优点:内部有个.可变的字符数组，速度快，内存消耗小。
 *在公司实际开发中，字符串的.增删改，要用. .StringBuilder , StringBuffer
 *
 */
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        String str = "好好学习";
        StringBuilder sb = new StringBuilder(str);
        //1.追加
        sb.append(",为了找个好工作");
        System.out.println("sb = " + sb);
        //2.修改  为了找个好工作  改为为了改变世界
        sb.replace(10,19,"为了改变世界");
        //3.删除
        sb.deleteCharAt(2);
        System.out.println("sb = " + sb);
        //3.1.删除字符的区间       很常见，比如说 www.goods.baidu.com
        sb.delete(2,5);
        System.out.println("sb = " + sb);
        //3.2 删除全部 ？？？
        sb.delete( 0, sb.length() );
        System.out.println("sb = " + sb);
        //4.插入 增加
        sb.insert(0,"努力活着");
        System.out.println("sb = " + sb);
        //5.对字符长进行反转  反转 ？？？....
        sb.reverse();
        System.out.println(sb);
    }
}
