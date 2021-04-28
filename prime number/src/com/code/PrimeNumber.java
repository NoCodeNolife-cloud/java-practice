package com.code;

import java.util.Arrays;

public class PrimeNumber {
    private boolean[] num;

    PrimeNumber(int size){
        num=new boolean[size];
        Arrays.fill(num, true);
    }

    public void Caculate(){
        num[0]=false;
        num[1]=false;
        for(int i=2;i<num.length;++i){
            if(num[i]){
                int j=i*2;
                while(j<num.length){
                    num[j]=false;
                    j+=i;
                }
            }
        }
    }

    public void Print(){
        for(int i=0;i<num.length;++i){
            if(num[i]){
                System.out.printf("%10d",i);
            }
        }
    }
}
