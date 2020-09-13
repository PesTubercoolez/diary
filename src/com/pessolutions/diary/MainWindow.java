package com.pessolutions.diary;

import com.pessolutions.diary.constants.MainWindowConstants;
import com.pessolutions.diary.constants.MenuBarConstants;

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

        add(getDefaultScrollPane(getDefaultTextArea()), BorderLayout.CENTER);

        add(getDefaultMainMenuBar(getDefaultFileMenu(), getDefaultEditMenu(), getDefaultTaskMenu()), BorderLayout.NORTH);

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

    private JMenuBar getDefaultMainMenuBar(JMenu fileMenu, JMenu taskMenu, JMenu editMenu) {

        JMenuBar menuBar = new JMenuBar();

        menuBar.add(fileMenu);

        menuBar.add(taskMenu);

        menuBar.add(editMenu);

        return menuBar;
    }

    private JMenu getDefaultFileMenu(){

        JMenu file = new JMenu(MenuBarConstants.FILE_MENU_NAME);

        return file;
    }

    private JMenu getDefaultEditMenu(){

        JMenu edit = new JMenu(MenuBarConstants.EDIT_MENU_NAME);

        return edit;

    }

    private JMenu getDefaultTaskMenu(){

        JMenu task = new JMenu(MenuBarConstants.TASK_MENU_NAME);

        return task;
    }

}
