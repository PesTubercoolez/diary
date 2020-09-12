package com.pessolutions.diary;

import com.pessolutions.diary.constants.MainWindowConstants;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    @Override
    protected void frameInit() {

        super.frameInit();

        setLayout(null);

        setSize(MainWindowConstants.DEFAULT_WIDTH, MainWindowConstants.DEFAULT_HEIGHT);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setTitle(MainWindowConstants.DEFAULT_NAME);

        add (createDefaultLabel());

        setVisible(true);

    }


    private JLabel createDefaultLabel(){

        JLabel menuLabel = new JLabel("Main Window");

        menuLabel.setBounds(MainWindowConstants.DEFAULT_LABEL_X, MainWindowConstants.DEFAULT_LABEL_Y, MainWindowConstants.DEFAULT_LABEL_WIDTH, MainWindowConstants.DEFAULT_LABEL_HEIGHT);

        return  menuLabel;
    }

    /*private JMenuBar createDefaultMainMenuBar() {

        JMenuBar menuBar = new JMenuBar();

        JLabel inscription = new JLabel("Main Window");

        menuBar.add(inscription);

        return menuBar;
    }

    private JTextArea createDefaultTextArea(){

        JTextArea menuTextArea = new JTextArea();

        menuTextArea.setLayout(new BorderLayout());

        menuTextArea.setSize(MainWindowConstants.DEFAULT_TEXT_AREA_WIDTH, MainWindowConstants.DEFAULT_TEXT_AREA_HEIGHT);

        menuTextArea.setFont(new Font("Arial", Font.BOLD, 18));

        menuTextArea.setLineWrap(true);

        return menuTextArea;
    }*/
}
