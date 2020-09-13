package com.pessolutions.diary;

import com.pessolutions.diary.constants.MainWindowConstants;

import javax.swing.*;


public class MainWindow extends JFrame {

    @Override
    protected void frameInit() {

        super.frameInit();

        setLayout(null);

        setSize(MainWindowConstants.DEFAULT_WIDTH, MainWindowConstants.DEFAULT_HEIGHT);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setTitle(MainWindowConstants.DEFAULT_NAME);

        setResizable(false);

        add(creationOfDefaultJLabel());

        setVisible(true);

    }

    private JLabel creationOfDefaultJLabel (){

        JLabel menuLabel  = new JLabel("Main Menu");

        menuLabel.setLayout(null);

        menuLabel.setBounds(550,500,100,100);

        return menuLabel;
    }

}
