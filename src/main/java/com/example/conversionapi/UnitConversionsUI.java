package com.example.conversionapi;

import javax.swing.*;
import java.awt.*;

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


    }
}
