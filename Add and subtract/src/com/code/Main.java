package com.code;

public class Main {

    public static void main(String[] args) {

        int prefix, postfix, rs;
        prefix = 1;
        rs = ++prefix;
        System.out.println("ǰ׺�������: prefix=" + prefix + " rs=" + rs);

        prefix = 1;
        rs = --prefix;
        System.out.println("ǰ׺�������: prefix=" + prefix + " rs=" + rs);

        postfix = 1;
        rs = postfix++;
        System.out.println("��׺�������: postfix=" + postfix + " rs=" + rs);

        postfix = 1;
        rs = postfix--;
        System.out.println("��׺�������: postfix=" + postfix + " rs=" + rs);
    }
}
