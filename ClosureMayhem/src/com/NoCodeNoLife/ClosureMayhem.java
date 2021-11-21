package com.NoCodeNoLife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClosureMayhem extends JFrame {

    JButton harry, wade, hansel;

    public ClosureMayhem() {
        super("Choose a Cursor");
        setSize(400, 80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        harry = new JButton("Crosshair");
        add(harry);
        wade = new JButton("Wait");
        add(wade);
        hansel = new JButton("Hand");
        add(hansel);
        // begin closure
        ActionListener act = (event) -> {
            if (event.getSource() == harry) {
                setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
            }
            if (event.getSource() == wade) {
                setCursor(new Cursor(Cursor.WAIT_CURSOR));
            }
            if (event.getSource() == hansel) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
            }
        };
        // end closure
        harry.addActionListener(act);
        wade.addActionListener(act);
        hansel.addActionListener(act);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClosureMayhem();
    }
}
