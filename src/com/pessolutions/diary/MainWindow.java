package com.pessolutions.diary;

import com.pessolutions.diary.constants.MainWindowConstants;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame {

MainWindowJItem myItem;
WindowTextArea textArea;
MainWindowJMenu windowMenu;

    @Override
    protected void frameInit() {

        myItem = new MainWindowJItem("Open File");

        /*myItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                myItem.openFile(textArea);
            }
        });*/

        super.frameInit();

        setLayout(new BorderLayout());

        setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 3, Toolkit.getDefaultToolkit().getScreenSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setTitle(MainWindowConstants.DEFAULT_NAME);

        add(new JScrollPane(textArea = new WindowTextArea()), BorderLayout.CENTER);

        add(new JMenuBar().add(windowMenu = new MainWindowJMenu("File", myItem)), BorderLayout.NORTH);

        setVisible(true);
    }

}
