package com.code;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String vector[];
        vector=new String[100];
        Random random=new Random();
        for(int i=0;i<vector.length;++i){
            vector[i]=String.valueOf(random.nextInt(100));
        }
        for(String item:vector){
            System.out.println(item);
        }
        System.out.println();
        int cnt=0;
        for(String item:vector){
            if(item.indexOf("1")!=-1){
                System.out.printf(item+" ");
                ++cnt;
            }
        }
        System.out.println();
        System.out.println("the number of the String which has the '1' is "+cnt);

        cnt=0;
        System.out.println();
        for(String item:vector){
            if(item.startsWith("1")){
                System.out.printf(item+" ");
                ++cnt;
            }
        }
        System.out.println();
        System.out.println("the number of the String which startsWhith '1' is "+cnt);

        cnt=0;
        System.out.println();
        for(String item:vector){
            if(item.endsWith("1")){
                System.out.printf(item+" ");
                ++cnt;
            }
        }
        System.out.println();
        System.out.println("the number of the String which endsWhith '1' is "+cnt);

    }
}
