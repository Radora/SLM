package com.example.conversionapi;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        JButton btnC = new JButton("Convert");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(celsius.getText().isEmpty())
                {
                    errorTempMessage.setText("Your input is empty! Please enter a value.");
                }

                else
                {
                    errorTempMessage.setText(null);
                    double cel = Double.parseDouble(celsius.getText());
                    unitConversionRequestModel.setFromType("c");
                    unitConversionRequestModel.setToType("f");
                    unitConversionRequestModel.setFromValue((float)cel);
                    conversionRestResponseModel = conversionApiRepository.readRequest(unitConversionRequestModel);

                    String far = String.format("%.2f",conversionRestResponseModel.getResult());
                    fahrenheit.setText(far);
                    //System.out.println(far);
                }
            }
        });
        btnC.setForeground(new Color(255, 255, 0));
        btnC.setBackground(new Color(25, 25, 112));
        btnC.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnC.setBounds(351, 91, 100, 40);
        contentPanel.add(btnC);


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

        JButton btnF = new JButton("Convert");
        btnF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(fahrenheit.getText().isEmpty())
                {
                    errorTempMessage.setText("Your input is empty! Please enter a value.");
                }

                else
                {
                    errorTempMessage.setText(null);
                    double far = Double.parseDouble(fahrenheit.getText());
                    unitConversionRequestModel.setFromType("f");
                    unitConversionRequestModel.setToType("c");
                    unitConversionRequestModel.setFromValue((float)far);
                    conversionRestResponseModel = conversionApiRepository.readRequest(unitConversionRequestModel);

                    String cel = String.format("%.2f", conversionRestResponseModel.getResult());

                    celsius.setText(cel);
                    //System.out.println(cel);
                }
            }
        });
        btnF.setForeground(Color.YELLOW);
        btnF.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnF.setBackground(new Color(25, 25, 112));
        btnF.setBounds(351, 157, 100, 40);
        contentPanel.add(btnF);

        //Main menu button

        JButton btnTempMainMenu = new JButton("Main Menu");
        btnTempMainMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                UnitConversionsUI unitConversionsUI = new UnitConversionsUI();
                unitConversionsUI.setVisible(true);
                dispose();
            }
        });
        btnTempMainMenu.setForeground(Color.WHITE);
        btnTempMainMenu.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnTempMainMenu.setBackground(Color.BLUE);
        btnTempMainMenu.setBounds(12, 499, 176, 41);
        contentPanel.add(btnTempMainMenu);


        //Exit button

        JButton btnTempExit = new JButton("Exit");
        btnTempExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        btnTempExit.setForeground(Color.WHITE);
        btnTempExit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnTempExit.setBackground(Color.RED);
        btnTempExit.setBounds(341, 499, 129, 41);
        contentPanel.add(btnTempExit);


        //Clear button

        JButton btnTempClear = new JButton("Clear");
        btnTempClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                celsius.setText(null);
                fahrenheit.setText(null);
                errorTempMessage.setText(null);
            }
        });
        btnTempClear.setForeground(Color.WHITE);
        btnTempClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnTempClear.setBackground(new Color(0, 100, 0));
        btnTempClear.setBounds(200, 499, 129, 41);
        contentPanel.add(btnTempClear);

        //Error message text field

        errorTempMessage = new JTextField();
        errorTempMessage.setForeground(Color.RED);
        errorTempMessage.setBackground(Color.BLACK);
        errorTempMessage.setFont(new Font("Tahoma", Font.PLAIN, 18));
        errorTempMessage.setHorizontalAlignment(SwingConstants.CENTER);
        errorTempMessage.setBounds(12, 349, 458, 137);
        contentPanel.add(errorTempMessage);
        errorTempMessage.setColumns(10);

    }
}
