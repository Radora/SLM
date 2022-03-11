package com.example.conversionapi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnitConversionsUI extends JFrame {

    private JPanel contentPanel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                UnitConversionsUI unitConversionsUI = new UnitConversionsUI();
                unitConversionsUI.setVisible(true);
            }
        });
    }

    public UnitConversionsUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 500);
        contentPanel = new JPanel();
        contentPanel.setForeground(Color.WHITE);
        contentPanel.setBackground(Color.DARK_GRAY);
        contentPanel.setBorder(UIManager.getBorder("Button.border"));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        JLabel labelTitle = new JLabel("Unit Converter");
        labelTitle.setForeground(Color.WHITE);
        labelTitle.setHorizontalAlignment(SwingConstants.CENTER);
        labelTitle.setFont(new Font("Candara", Font.BOLD, 30));
        labelTitle.setBounds(12, 13, 441, 79);
        contentPanel.add(labelTitle);


        JButton btnTemperature = new JButton("Temperature");
        btnTemperature.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TemperatureUI temperature = new TemperatureUI();
                temperature.setVisible(true);
                dispose();
            }
        });
        btnTemperature.setBackground(Color.BLUE);
        btnTemperature.setForeground(Color.WHITE);
        btnTemperature.setIcon(null);
        btnTemperature.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
        btnTemperature.setBounds(100,100,250,50);
        contentPanel.add(btnTemperature);

        JButton btnWeight = new JButton("Weight");
        btnWeight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WeightUI weight = new WeightUI();
                weight.setVisible(true);
                dispose();
            }
        });
        btnWeight.setBackground(Color.BLUE);
        btnWeight.setForeground(Color.WHITE);
        btnWeight.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 20));
        btnWeight.setBounds(100, 200, 250, 50);
        contentPanel.add(btnWeight);


        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnExit.setForeground(Color.WHITE);
        btnExit.setFont(new Font("Tahoma", Font.PLAIN,20));
        btnExit.setBackground(Color.RED);
        btnExit.setBounds(160,350,130,35);
        btnExit.setHorizontalAlignment(SwingConstants.CENTER);
        contentPanel.add(btnExit);

    }
}
