package com.jetbrains.view;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class WeatherGUI {
    //Panels
    private JPanel inputPanel;
    private JPanel weatherPanel;

    //components input panel
    private JButton search;
    private JLabel cityLabel;
    private JLabel hourLabel;
    private JTextField cityField;
    private JTextField hourField;
    private JComboBox refreshRate;

    //components for weather panel

    //components for container
    private JLabel answer;





    /**
     *
     */
    public WeatherGUI(){

        SpringLayout layout = new SpringLayout();


        // Jframe creation
        JFrame frame = new JFrame("Weather Report");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(300,300);
        frame.setResizable(false);
        //Jpanels
        weatherPanel = new JPanel();
        Dimension weatherD = new Dimension(300,500);
        weatherPanel.setMinimumSize(weatherD);
        weatherPanel.setPreferredSize(weatherD);
        weatherPanel.setBackground(Color.YELLOW);



        inputPanel = new JPanel();
        Dimension inputDim = new Dimension(400,250);
        inputPanel.setMinimumSize(inputDim);
        inputPanel.setPreferredSize(inputDim);
        inputPanel.setBackground(Color.WHITE);
        inputPanel.setLayout(layout);

        Container container = frame.getContentPane();
        container.setLayout(layout);
        Dimension d2 = new Dimension(700,500);
        container.setPreferredSize(d2);
        container.setBackground(Color.WHITE);


        //Creating components

        //input panel
        search = new JButton("Search");
        cityLabel = new JLabel("City:");
        hourLabel = new JLabel("Hour:");
        cityField = new JTextField(20);
        hourField = new JTextField(20);
        String[] endTime = new String[]{"1", "2", "3"};
        refreshRate = new JComboBox(endTime);

        //weather panel
        //test = new JList();

        //container panel


        //Panels
        container.add(inputPanel);
        container.add(weatherPanel);


        //Adds the components to the panel
        //InputPanel
        inputPanel.add(search);
        inputPanel.add(cityLabel);
        inputPanel.add(cityField);
        inputPanel.add(hourLabel);
        inputPanel.add(hourField);
        inputPanel.add(refreshRate);


        //weatherPanel
        //weatherPanel.add(test);

        //container panel



        // ----------------------      Layout management     -------------------------

        //Panel layout management
        //layout.putConstraint(SpringLayout.HEIGHT, inputPanel, 0, SpringLayout.HEIGHT, container);
        layout.putConstraint(SpringLayout.SOUTH,inputPanel,0,SpringLayout.SOUTH,container);
        layout.putConstraint(SpringLayout.WEST, weatherPanel, 0 , SpringLayout.EAST, inputPanel);

        //Input panel
        layout.putConstraint(SpringLayout.SOUTH, search, -60, SpringLayout.SOUTH, inputPanel);
        layout.putConstraint(SpringLayout.WEST, search, 40, SpringLayout.WEST, inputPanel);
        layout.putConstraint(SpringLayout.SOUTH, hourLabel, -10, SpringLayout.NORTH, search);
        layout.putConstraint(SpringLayout.WEST, hourField, 10, SpringLayout.EAST, hourLabel);
        layout.putConstraint(SpringLayout.NORTH, hourField, 0 , SpringLayout.NORTH, hourLabel);
        layout.putConstraint(SpringLayout.SOUTH, cityLabel, -20, SpringLayout.NORTH, hourLabel);
        layout.putConstraint(SpringLayout.WEST, cityField, 0, SpringLayout.WEST, hourField);
        layout.putConstraint(SpringLayout.NORTH, cityField, 0, SpringLayout.NORTH, cityLabel);
        layout.putConstraint(SpringLayout.WEST, refreshRate, 30, SpringLayout.EAST, cityField);
        layout.putConstraint(SpringLayout.SOUTH, refreshRate, -120, SpringLayout.SOUTH, inputPanel);



        //Connects the panel to the frame and sets the pack and makes the frame visible.
        frame.setContentPane(container);
        frame.pack();
        frame.setVisible(true);




    }

}
