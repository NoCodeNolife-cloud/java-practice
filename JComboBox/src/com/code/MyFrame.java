package com.code;

import javax.swing.*;

public class MyFrame {

    private JPanel panel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JLabel label1;
    private JLabel label2;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MyFrame");
        frame.setContentPane(new MyFrame().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
