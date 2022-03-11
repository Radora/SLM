package com.example.conversionapi;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.example.conversionapi.UnitConversionsUI;
import com.example.conversionapi.model.ConversionRestResponseModel;
import com.example.conversionapi.model.UnitConversionRequestModel;
import com.example.conversionapi.repository.ConversionApiRepository;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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

        JButton btnG = new JButton("Convert");
        btnG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(gramm.getText().isEmpty())
                {
                    errorWeightMessage.setText("Your input is empty! Please enter a value.");
                }
                else
                {
                    errorWeightMessage.setText(null);
                    double gm = Double.parseDouble(gramm.getText());
                    unitConversionRequestModel.setFromType("g");
                    unitConversionRequestModel.setToType("kg");
                    unitConversionRequestModel.setFromValue((float) gm);
                    conversionRestResponseModel = conversionApiRepository.readRequest(unitConversionRequestModel);

                    String kg = String.format("%.4f", conversionRestResponseModel.getResult());

                    kilogram.setText(kg);
                    //System.out.println(kg);
                }
            }
        });
        btnG.setForeground(Color.YELLOW);
        btnG.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnG.setBackground(new Color(25, 25, 112));
        btnG.setBounds(351, 100, 100, 40);
        contentPanel.add(btnG);


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

        JButton btnKg = new JButton("Convert");
        btnKg.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(kilogram.getText().isEmpty())
                {
                    errorWeightMessage.setText("Your input is empty! Please enter a value.");
                }
                else
                {
                    errorWeightMessage.setText(null);
                    double Kg = Double.parseDouble(kilogram.getText());
                    unitConversionRequestModel.setFromType("kg");
                    unitConversionRequestModel.setToType("g");
                    unitConversionRequestModel.setFromValue((float) Kg);
                    conversionRestResponseModel = conversionApiRepository.readRequest(unitConversionRequestModel);

                    String GM = String.format("%.4f", conversionRestResponseModel.getResult());

                    gramm.setText(GM);
                }
            }
        });
        btnKg.setForeground(Color.YELLOW);
        btnKg.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnKg.setBackground(new Color(25, 25, 112));
        btnKg.setBounds(351, 170, 100, 40);
        contentPanel.add(btnKg);

        //Main menu button

        JButton btnWeightMainMenu = new JButton("Main Menu");
        btnWeightMainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UnitConversionsUI unitConversionsUI = new UnitConversionsUI();
                unitConversionsUI.setVisible(true);
                dispose();
            }
        });
        btnWeightMainMenu.setForeground(Color.WHITE);
        btnWeightMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnWeightMainMenu.setBackground(Color.BLUE);
        btnWeightMainMenu.setBounds(12, 499, 176, 41);
        contentPanel.add(btnWeightMainMenu);


        //Exit button

        JButton btnWeightExit = new JButton("Exit");
        btnWeightExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnWeightExit.setForeground(Color.WHITE);
        btnWeightExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnWeightExit.setBackground(Color.RED);
        btnWeightExit.setBounds(341, 499, 129, 41);
        contentPanel.add(btnWeightExit);


        //Clear button

        JButton btnWeightClear = new JButton("Clear");
        btnWeightClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                gramm.setText(null);
                kilogram.setText(null);
                errorWeightMessage.setText(null);

            }
        });
        btnWeightClear.setForeground(Color.WHITE);
        btnWeightClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnWeightClear.setBackground(new Color(0, 100, 0));
        btnWeightClear.setBounds(200, 499, 129, 41);
        contentPanel.add(btnWeightClear);

        //Error message text field

        errorWeightMessage = new JTextField();
        errorWeightMessage.setForeground(Color.RED);
        errorWeightMessage.setBackground(Color.BLACK);
        errorWeightMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        errorWeightMessage.setHorizontalAlignment(SwingConstants.CENTER);
        errorWeightMessage.setBounds(12, 349, 458, 137);
        contentPanel.add(errorWeightMessage);
        errorWeightMessage.setColumns(10);

    }
}
