package com.pessolutions.diary;

import com.pessolutions.diary.constants.MainWindowConstants;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    @Override
    protected void frameInit() {

        super.frameInit();

        setLayout(new BorderLayout());

        setSize(MainWindowConstants.DEFAULT_WIDTH, MainWindowConstants.DEFAULT_HEIGHT);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setTitle(MainWindowConstants.DEFAULT_NAME);

        add(createDefaultMainMenuBar(), BorderLayout.NORTH);

        setVisible(true);
    }

    private JMenuBar createDefaultMainMenuBar() {

        JMenuBar menuBar = new JMenuBar();

        JLabel inscription = new JLabel("Main Window");

        menuBar.add(inscription);

        return menuBar;
    }
}
