package com.pessolutions.diary;

import com.pessolutions.diary.constants.MainWindowConstants;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    @Override
    protected void frameInit() {

        super.frameInit();

        setLayout(new BorderLayout());

        setSize(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setTitle(MainWindowConstants.DEFAULT_NAME);

        add(getDefaultScrollPane(getDefaultTextArea()));

        setVisible(true);

    }

    private JTextArea getDefaultTextArea(){

        JTextArea menuTextArea = new JTextArea();

        menuTextArea.setLayout(null);

        menuTextArea.setFont(new Font("Arial", Font.BOLD, 18));

        menuTextArea.setLineWrap(true);

        return menuTextArea;
    }

    private JScrollPane getDefaultScrollPane(JTextArea textArea){

        return new JScrollPane(textArea);
    }
}
