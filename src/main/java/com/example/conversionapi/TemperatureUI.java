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

        //Celsius label + inputfield + Converter button

        JLabel labelCelsius= new JLabel("Celsius");
        labelCelsius.setForeground(Color.WHITE);
        labelCelsius.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelCelsius.setBackground(Color.BLACK);
        labelCelsius.setBounds(12, 91, 107, 40);
        contentPanel.add(labelCelsius);

        celsius = new JTextField();
        celsius.setHorizontalAlignment(SwingConstants.CENTER);
        celsius.setFont(new Font("Tahoma", Font.PLAIN, 20));
        celsius.setBounds(131, 91, 147, 40);
        contentPanel.add(celsius);
        celsius.setColumns(10);

        JLabel labelCelsiusUnit = new JLabel("\u00B0c ");
        labelCelsiusUnit.setFont(new Font("Tahoma", Font.PLAIN, 30));
        labelCelsiusUnit.setForeground(Color.WHITE);
        labelCelsiusUnit.setBounds(284, 91, 55, 40);
        contentPanel.add(labelCelsiusUnit);







        //Fahrenheit label + inputfield + Converter button

        JLabel labelFahrenheit = new JLabel("Fahrenheit");
        labelFahrenheit.setForeground(Color.WHITE);
        labelFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 18));
        labelFahrenheit.setBackground(Color.BLACK);
        labelFahrenheit.setBounds(12, 157, 107, 40);
        contentPanel.add(labelFahrenheit);

        fahrenheit = new JTextField();
        fahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
        fahrenheit.setForeground(new Color(25, 25, 112));
        fahrenheit.setFont(new Font("Tahoma", Font.BOLD, 20));
        fahrenheit.setColumns(10);
        fahrenheit.setBounds(131, 157, 147, 40);
        contentPanel.add(fahrenheit);

        JLabel labelFahrenheitUnit = new JLabel("\u00B0f");
        labelFahrenheitUnit.setForeground(Color.WHITE);
        labelFahrenheitUnit.setFont(new Font("Tahoma", Font.PLAIN, 30));
        labelFahrenheitUnit.setBounds(284, 157, 55, 40);
        contentPanel.add(labelFahrenheitUnit);
    }
}
