package com.pessolutions.diary;

import com.ui.menu.MainWindowJMenu;

import com.ui.menuitem.MainWindowJItem;
import com.ui.textarea.WindowTextArea;
import com.pessolutions.diary.constants.*;


import javax.swing.*;
import java.awt.*;



public class MainWindow extends JFrame {

private MainWindowJItem openItem;
private MainWindowJItem saveAsItem;
private WindowTextArea textArea;
private MainWindowJMenu windowMenu;
private MainWindowJMenuBar windowMenuBar;
private MainWindowJItem exitItem;
private MainWindowJItem saveItem;
private MainWindowJItem newItem;

    @Override
    protected void frameInit() {

        textArea = new WindowTextArea();

        openItem = new MainWindowJItem("Open File");

        saveAsItem = new MainWindowJItem("Save As");

        exitItem = new MainWindowJItem("Exit");

        saveItem = new MainWindowJItem("Save");

        newItem = new MainWindowJItem("New");


        openItem.addActionListener(MainWindowAction.setOpenAction(textArea));

        saveAsItem.addActionListener(MainWindowAction.setSaveAsAction(textArea));

        saveItem.addActionListener(MainWindowAction.setSaveAction(textArea));

        exitItem.addActionListener(MainWindowAction.setExitAction(textArea));

        newItem.addActionListener(MainWindowAction.newFileAction(textArea));

        super.frameInit();

        setLayout(new BorderLayout());

        setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 3,

                Toolkit.getDefaultToolkit().getScreenSize().height / 2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setTitle(MainWindowConstants.DEFAULT_NAME);

        add(new JScrollPane(textArea), BorderLayout.CENTER);

        add(windowMenuBar = new MainWindowJMenuBar(windowMenu =  new MainWindowJMenu(MenuBarConstants.FILE_MENU_NAME,newItem,openItem, saveItem, saveAsItem, exitItem)), BorderLayout.NORTH);

        setVisible(true);
    }

}
