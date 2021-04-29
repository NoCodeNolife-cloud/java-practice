package com.code;

public class ClassName {

    private int value;

    // public
    public ClassName(int _value){
        System.out.println("call public constructor");
        value=_value;
    }

    // default
   /*ClassName(int _value){
        System.out.println("call defalut constructor");
        value=_value;
    }*/

    // protected
    /*protected ClassName(int _value){
        System.out.println("call protected constructor");
        value=_value;
    }*/

    // private
    /*private ClassName(int _value){
        System.out.println("call private constructor");
        value=_value;
    }*/

    public void Print(){
        System.out.println(value);
    }
}
