package com.code;

import javax.swing.*;

public class MyFrame {
    private JTable table2;
    private JPanel panel1;
    private JScrollPane scrollpane1;

    String head[]={"name","number"};
    Object contains[][]={{"langwen","1525"},
            {"xujia","1524"},
            {"jack","4142"},
            {"lucy","7455"},
            {"tom","4452"},
            {"tur","4146"}};

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        frame.setContentPane(new MyFrame().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,125);
        frame.setVisible(true);
    }

    private void createUIComponents() {
        table2 =new JTable(contains,head);
        scrollpane1=new JScrollPane();
        scrollpane1.setViewportView(table2);
    }
}
