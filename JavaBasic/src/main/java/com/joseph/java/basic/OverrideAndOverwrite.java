package com.joseph.java.basic;

/**
 * private: only class
 * enum: all class in the package
 * protected: all class in the package & inherited class in other package
 * public all
 */
public class OverrideAndOverwrite {

    public String override(String a, int b){
        return null;
    }

     String overridePrivate(String a, int b){
        return null;
    }

    /*
    顺序不同也是可以的！
     */
    public String override(int b, String s){
        return null;
    }

    public A overrideInt(int b, String s){
        return null;
    }

    public A overrideException(int b, String s) throws Exception{
        return null;
    }

    public A overrideException2(int b, String s) throws E, E2{
        return null;
    }

    //访问修饰符不同，不行！
//    protected String override(int b, String s){
//        return null;
//    }

    //返回值不同不行！
//    public int override(int b, String s){
//        return 0;
//    }
}

class OverWrite extends OverrideAndOverwrite{

    //访问范围 大于等于父类
    protected String overridePrivate(String a, int b){
        return null;
    }

    //返回值 范围小于等于 父类
    public B overrideInt(int b, String s){
        return null;
    }

    //异常范围小于等于父类
    public A overrideException(int b, String s) throws E{
        return null;
    }

    public A overrideException2(int b, String s) throws E{
        return null;
    }

}

class A{

}

class B extends A{

}

class E extends Exception{

}

class E2 extends Exception{

}
