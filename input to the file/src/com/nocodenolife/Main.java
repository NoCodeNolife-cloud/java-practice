package com.nocodenolife;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Main {

    public static void main(String[] args) {

        // 全局变量
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        File file= new File("out.txt");

        try {

            fileOutputStream = new FileOutputStream(file);// 打开file文件并写入
            fileInputStream=new FileInputStream(FileDescriptor.in);// FileDescriptor.in表示系统标准输入设备

            int ch;

            System.out.print("输入一行信息，保存在"+file.getName()+"中: ");
            while((ch=fileInputStream.read())!='\n'){

                fileOutputStream.write(ch);
            }

            // 关闭文件
            fileOutputStream.close();
            fileOutputStream.close();
        } catch(IOException e){

            e.printStackTrace();
        }
    }
}
