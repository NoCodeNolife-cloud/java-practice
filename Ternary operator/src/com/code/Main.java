package com.code;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        int score=80;
        System.out.println((score>60?"及格":"不及格"));

        Date date=new Date();
        System.out.println(date.toString());
    }
}
