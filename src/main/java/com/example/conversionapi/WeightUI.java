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

        //Gramm label + inputfield + Converter button

        JLabel labelGramm = new JLabel("Gram");
        labelGramm.setForeground(Color.WHITE);
        labelGramm.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelGramm.setBackground(Color.BLACK);
        labelGramm.setBounds(12, 100, 107, 40);
        contentPanel.add(labelGramm);

        gramm = new JTextField();
        gramm.setHorizontalAlignment(SwingConstants.CENTER);
        gramm.setFont(new Font("Tahoma", Font.PLAIN, 20));
        gramm.setColumns(10);
        gramm.setBounds(131, 100, 147, 40);
        contentPanel.add(gramm);

        JLabel labelGramUnit = new JLabel("g");
        labelGramUnit.setForeground(Color.WHITE);
        labelGramUnit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelGramUnit.setBackground(Color.BLACK);
        labelGramUnit.setBounds(284, 100, 55, 40);
        contentPanel.add(labelGramUnit);






        //Kilogram label + inputfield + Converter button

        JLabel labelKilogram = new JLabel("Kilogram");
        labelKilogram.setForeground(Color.WHITE);
        labelKilogram.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelKilogram.setBackground(Color.BLACK);
        labelKilogram.setBounds(12, 170, 107, 40);
        contentPanel.add(labelKilogram);

        kilogram = new JTextField();
        kilogram.setHorizontalAlignment(SwingConstants.CENTER);
        kilogram.setFont(new Font("Tahoma", Font.PLAIN, 20));
        kilogram.setColumns(10);
        kilogram.setBounds(131, 170, 147, 40);
        contentPanel.add(kilogram);

        JLabel labelKilogramUnit = new JLabel("kg");
        labelKilogramUnit.setForeground(Color.WHITE);
        labelKilogramUnit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelKilogramUnit.setBackground(Color.BLACK);
        labelKilogramUnit.setBounds(284, 170, 55, 40);
        contentPanel.add(labelKilogramUnit);


    }
}
