package com.ui.menu;

import javax.swing.*;

public class MainWindowJMenu extends JMenu {

    MainWindowJMenu(){

        super();

    }

    public MainWindowJMenu(String text, JMenuItem menuItem, JMenuItem menuItem2, JMenuItem menuItem3, JMenuItem menuItem4, JMenuItem menuItem5){

        super(text);

        add(menuItem);

        add(menuItem2);

        add(menuItem3);

        add(menuItem4);

        add(menuItem5);
    }


}
