package com.pessolutions.diary;

import com.pessolutions.diary.constants.MainWindowConstants;
import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {

    @Override
    protected void frameInit() {

        super.frameInit();

        setLayout(new BorderLayout());

        setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 3, Toolkit.getDefaultToolkit().getScreenSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setTitle(MainWindowConstants.DEFAULT_NAME);

        add(new JScrollPane(new WindowTextArea()), BorderLayout.CENTER);

        add(new JMenuBar().add(new JMenu()), BorderLayout.NORTH);

        setVisible(true);
    }

}
