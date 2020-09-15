package com.pessolutions.diary;

import com.pessolutions.diary.constants.ItemMenuConstants;
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

        add(getDefaultMainMenuBar(getDefaultFileMenu(getMenuItems()), getDefaultEditMenu(), getDefaultTaskMenu()), BorderLayout.NORTH);

        add(getScrollMenu(getTextArea()), BorderLayout.CENTER);

        setVisible(true);

    }

    private JMenuBar getDefaultMainMenuBar(JMenu fileMenu, JMenu taskMenu, JMenu editMenu) {

        JMenuBar menuBar = new JMenuBar();

        menuBar.add(fileMenu);

        menuBar.add(taskMenu);

        menuBar.add(editMenu);

        return menuBar;
    }

    private JMenu getDefaultEditMenu(){

        JMenu edit = new JMenu(MenuBarConstants.EDIT_MENU_NAME);

        return edit;

    }

    private JMenu getDefaultTaskMenu(){

        JMenu task = new JMenu(MenuBarConstants.TASK_MENU_NAME);

        return task;
    }


    private JTextArea getTextArea(){

        JTextArea textArea = new JTextArea();

        textArea.setLineWrap(true);

        textArea.setFont(new Font ("Area", Font.BOLD, 18));

        return textArea;
    }

    private JScrollPane getScrollMenu(JTextArea menuTextArea){

        return new JScrollPane(menuTextArea);

    }

    private JMenuItem [] getMenuItems(){

        JMenuItem menuItem;

        JMenuItem[] menuItemArr = new JMenuItem[ItemMenuConstants.DEFAULT_MENU_ITEM_QUANTITY];

        for(int x = 0; x<menuItemArr.length; x++){

            menuItem = new JMenuItem();

            menuItem.setText(ItemMenuConstants.DEFAULT_MENU_ITEM_NAME[x]);

            menuItemArr[x] = menuItem;
        }
        return menuItemArr;
    }


    private JMenu getDefaultFileMenu(JMenuItem[] menuItems){

        JMenu file = new JMenu(MenuBarConstants.FILE_MENU_NAME);

        for (JMenuItem menuItem : menuItems) {

            file.add(menuItem);

        }

        return file;
    }

}
