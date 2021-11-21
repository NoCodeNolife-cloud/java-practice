package com.NoCodeNoLife;

import java.net.MalformedURLException;

/**
 * Data: Created in 2021/11/20
 * Description:
 */
public class Main {

    public static void main(String[] args){
        if(args.length<1){
            System.out.println("Usage: java WebReader url");
            System.exit(1);
        }
        try{
            WebReader app=new WebReader();
            app.getData(args[0]);
        }catch (MalformedURLException mue){
            System.out.println("Bad URL: "+args[0]);
        }
    }
}
