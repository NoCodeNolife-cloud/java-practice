package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends JFrame {

    JProgressBar current;
    int num = 0;
    boolean done = false;

    public Main() {
        super("Progress Moitor:");
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (done) {
                    dispose();
                    System.exit(0);
                }
            }
        });
        setSize(400, 100);
        setLayout(new FlowLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        current.setPreferredSize(new Dimension(360, 48));
        add(current);
        setVisible(true);
        iterate();
    }

    public final void iterate() {
        while (num < 2000) {
            current.setValue(num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            num += 95;
        }
        done = true;
    }

    public static void main(String[] args) {
        new Main();
    }
}
