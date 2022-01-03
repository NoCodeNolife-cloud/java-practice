package com;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter printWriter = new PrintWriter(System.out);
        while (scanner.hasNext()) {
            printWriter.println(scanner.nextLine());
            printWriter.flush();
        }
        printWriter.close();
    }
}