package com;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

public class MortgageCalc implements ActionListener {


       private double cost = 0; //cost will need the formula
       private JLabel label;
       private JFrame frame;
       private JPanel panel;

    public MortgageCalc() {
            frame = new JFrame();

            JButton button = new JButton("Click to start");
            button.addActionListener(this);


            label = new JLabel("Monthly Cost");


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

            int loan = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter loan amount:"));
            int years = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of years:"));
            int months = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of months:"));
            double rate = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter interest rate:"));
            rate = (rate/100)/12;
            double time = (years*12) + months;
            double p;
            p = (loan * rate) / (1 - Math.pow(1 + rate, -time));
            p = Math.round(p * 100.0) / 100.0;

            label.setText("Monthly Cost £" + p);

        }
    }

