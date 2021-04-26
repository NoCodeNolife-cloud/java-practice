package com.code;

public class Main {

    public static void main(String[] args) {
	    int array1[]={20,10,50,40,30};
	    int array2[]={1,2,3};
	    int array[]=new int[array1.length+array2.length];
	    for(int i=0;i<array.length;++i){
	        if(i<array1.length){
	            array[i]=array1[i];
            }else{
	            array[i]=array2[i-array1.length];
            }
        }
	    for(int item:array){
	        System.out.println(item);
        }
    }
}
