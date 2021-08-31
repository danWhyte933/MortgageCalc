package com;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class MortgageCalc implements ActionListener {

       private int count = 0;
       private JLabel label;
       private JFrame frame;
       private JPanel panel;

    public MortgageCalc() {
            frame = new JFrame();

            JButton button = new JButton("Click me");
            button.addActionListener(this);


            label = new JLabel("Number of clicks: 0");


            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            panel.setLayout(new GridLayout(0, 1));
            panel.add(button);
            panel.add(label);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Mortgage Calculator");
            frame.pack();
            frame.setVisible(true);


        }

        public static void main (String[]args){
            new MortgageCalc();
        }

        @Override
        public void actionPerformed (ActionEvent e){
            count++;
            label.setText("Number of clicks " + count);

        }
    }
