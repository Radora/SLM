package com.example.conversionapi;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.example.conversionapi.UnitConversionsUI;
import com.example.conversionapi.model.ConversionRestResponseModel;
import com.example.conversionapi.model.UnitConversionRequestModel;
import com.example.conversionapi.repository.ConversionApiRepository;

import java.awt.*;


public class WeightUI extends JFrame {

    private JPanel contentPanel;
    private JTextField gramm;
    private JTextField kilogram;
    private JTextField errorWeightMessage;
    private ConversionApiRepository conversionApiRepository = new ConversionApiRepository();
    private UnitConversionRequestModel unitConversionRequestModel = new UnitConversionRequestModel();
    private ConversionRestResponseModel conversionRestResponseModel = new ConversionRestResponseModel();


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                WeightUI weight = new WeightUI();
                weight.setVisible(true);
            }
        });
    }

    public WeightUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPanel = new JPanel();
        contentPanel.setForeground(Color.WHITE);
        contentPanel.setBackground(Color.DARK_GRAY);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);


        //Titel

        JLabel labelWeightTitle = new JLabel("Weight Conversion");
        labelWeightTitle.setHorizontalAlignment(SwingConstants.CENTER);
        labelWeightTitle.setForeground(Color.WHITE);
        labelWeightTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
        labelWeightTitle.setBounds(12, 13, 458, 54);
        contentPanel.add(labelWeightTitle);

    }
}
