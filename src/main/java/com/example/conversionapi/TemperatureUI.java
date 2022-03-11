package com.example.conversionapi;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

import com.example.conversionapi.UnitConversionsUI;
import com.example.conversionapi.model.ConversionRestResponseModel;
import com.example.conversionapi.model.UnitConversionRequestModel;
import com.example.conversionapi.repository.ConversionApiRepository;

public class TemperatureUI extends JFrame {

    private JPanel contentPanel;
    private JTextField celsius;
    private JTextField fahrenheit;
    private JTextField errorTempMessage;
    private ConversionApiRepository conversionApiRepository = new ConversionApiRepository();
    private UnitConversionRequestModel unitConversionRequestModel = new UnitConversionRequestModel();
    private ConversionRestResponseModel conversionRestResponseModel = new ConversionRestResponseModel();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                TemperatureUI temperature = new TemperatureUI();
                temperature.setVisible(true);
            }
        });
    }

    public TemperatureUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 600);
        contentPanel = new JPanel();
        contentPanel.setForeground(Color.WHITE);
        contentPanel.setBackground(Color.DARK_GRAY);
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        //Titel

        JLabel labelTemperatureTitle = new JLabel("Temperature Conversion");
        labelTemperatureTitle.setHorizontalAlignment(SwingConstants.CENTER);
        labelTemperatureTitle.setForeground(Color.WHITE);
        labelTemperatureTitle.setFont(new Font("Tahoma", Font.PLAIN, 30));
        labelTemperatureTitle.setBounds(12, 13, 458, 54);
        contentPanel.add(labelTemperatureTitle);
    }
}
