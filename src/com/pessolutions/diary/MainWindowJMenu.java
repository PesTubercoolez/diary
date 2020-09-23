package com.pessolutions.diary;

import javax.swing.*;

public class MainWindowJMenu extends JMenu {

    MainWindowJMenu(){

        super();

    }

    MainWindowJMenu(String text, JMenuItem menuItem){

        super(text);

        setText(text);

        add(menuItem);

    }


}
