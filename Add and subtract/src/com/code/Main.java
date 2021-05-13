package com.code;

public class Main {

    public static void main(String[] args) {

        int prefix, postfix, rs;
        prefix = 1;
        rs = ++prefix;
        System.out.println("前缀加运算后: prefix=" + prefix + " rs=" + rs);

        prefix = 1;
        rs = --prefix;
        System.out.println("前缀减运算后: prefix=" + prefix + " rs=" + rs);

        postfix = 1;
        rs = postfix++;
        System.out.println("后缀加运算后: postfix=" + postfix + " rs=" + rs);

        postfix = 1;
        rs = postfix--;
        System.out.println("后缀减运算后: postfix=" + postfix + " rs=" + rs);
    }
}
