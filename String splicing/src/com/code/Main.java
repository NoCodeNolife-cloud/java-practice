package com.code;

public class Main {

    public static void main(String[] args) {
        String s1="Hello";
        String s2=s1+" ";
        String s3=s2+"world";
        System.out.println(s3);

        String s4="Hello";
        s4+=" ";
        s4+="world";
        System.out.println(s4);

        String s5="Hello";
        s5=s5.concat(" ").concat("world");
        System.out.println(s5);

        int age=18;
        String s6="She is "+age+ " years old";
        System.out.println(s6);

        byte chara=86;
        String s9="The character is "+chara;
        System.out.println(s9);

        char score='A';
        String s7="her English grade is "+score;
        System.out.println(s7);

        java.util.Date now=new java.util.Date();
        String s8="today is "+now;
        System.out.println(s8);
    }
}
