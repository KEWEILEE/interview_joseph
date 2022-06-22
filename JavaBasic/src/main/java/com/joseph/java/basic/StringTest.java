package com.joseph.java.basic;

/*
String, StringBuffer, StringBuilder
1. String final 修饰，不可变，每次操作都会返回一个新的对象
2. String Buffer / Builder 都是在原对象上操作
2.1 String Buffer 是线程安全的的
2.2 String Builder 是线程不安全的

性能：String Builder > String Buffer > String

优先使用 StringBuilder， 多线程使用StringBuffer
 */
public class StringTest {

    public static void main(String[] args) {
        String s = "String";
        String s1 = s.toLowerCase();
        System.out.println(1);
    }
}
