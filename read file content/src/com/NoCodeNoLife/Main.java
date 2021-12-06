package com.NoCodeNoLife;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        readFileContent("./info.txt");
    }

    public static void readFileContent(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 装饰者模式使得BufferedReader组合了一个Reader对象
        // 在调用BufferedReader的close()方法时会去调用Reader的close()方法
        // 因此只要一个close()调用即可
        bufferedReader.close();
    }
}
