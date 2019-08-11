package com.patricklaflin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewColorFrame extends JFrame {
    JButton red, green, blue;

    public NewColorFrame() {
        super("NewColorFrame");
        setLookAndFeel();
        setSize(322,122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);
        // begin lambda expression
        ActionListener act = (event) -> {
            if(event.getSource() == red) {
                getContentPane().setBackground(Color.RED);
            }
            if(event.getSource() == green) {
                getContentPane().setBackground(Color.GREEN);
            }
            if(event.getSource() == blue) {
                getContentPane().setBackground(Color.BLUE);
            }
        };
        // end lambda expression
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            // ignore error
        }
    }

    public static void main(String[] args) {
        new NewColorFrame();
    }
}
