package com.pessolutions.diary;

import javax.swing.*;

public class MainWindowMenuCreator extends JMenuItemCreator {

    MainWindowMenuCreator(){

        itemQuantity = 0;
    }

    @Override
    JMenu addItemIntoWindowMenu(JMenuItem [] menuItems ,JMenu windowMenu, int itemQuantity) {

        this.itemQuantity = itemQuantity;

        for (int x = 0; x < this.itemQuantity; x++){

            windowMenu.add(menuItems[x]);

        }

        return windowMenu;
    }



}
