package com.pessolutions.diary;

import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;
import java.awt.*;

public class MainWindow extends JFrame {

    private JLabel inscription;

    private JMenuBar menuBar;

    @Override
    protected void frameInit() {

        super.frameInit();

        setLayout(new BorderLayout());

        setSize(FrameConstant.scrWidth, FrameConstant.scrHeight);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setVisible(true);
    }

    private JMenuBar  createDefaultMainMenuBar() {

        menuBar = new JMenuBar();
        return menuBar;
    }
}
