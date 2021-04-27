package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("input the sentence: ");
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println("the result is");
        System.out.println("----------");
        String vector[]=str.split(" ");
        for(String item:vector){
            System.out.println(item);
        }
    }
}
