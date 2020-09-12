package com.pessolutions.diary;

import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuBarUI;
import java.awt.*;

public class MyFrame  {

    public static void frameCreate(){

        // Creation of frame and its elements

        ImageIcon iconFrame = new ImageIcon("D:\\Pictures\\athena-power-symbol-achilles-athens-greek-god.png");

        JFrame testFrame = new JFrame("Parser v.0.1");

        JLabel testLabel = new JLabel("Main menu");

        JMenuBar testMenu = new JMenuBar();

        //MenuElement


        // Frame configuration

        testFrame.setLayout(new BorderLayout());

        testFrame.setSize(700,700);

        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        testFrame.setIconImage(iconFrame.getImage());

        testFrame.setLocationRelativeTo(null);

        // "Find" Button configuration

        // "Save" Button configuration

        // Menu bar configuration

        testMenu.setUI(new BasicMenuBarUI() {

            @Override
            public void paint(Graphics g, JComponent c) {

                g.setColor(Color.gray);

                g.fillRect(0, 0, c.getWidth(), c.getHeight());

            }

        });

        testMenu.add(testLabel);

        // Displaying Frame

        testFrame.add(testMenu, BorderLayout.NORTH);

        testFrame.setVisible(true);

    }

}
