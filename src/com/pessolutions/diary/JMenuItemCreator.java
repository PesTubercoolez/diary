package com.pessolutions.diary;

import javax.swing.*;

public abstract class JMenuItemCreator{

    protected int itemQuantity;

    abstract JMenu addItemIntoWindowMenu(JMenuItem[] menuItems, JMenu windowMenu, int itemQuantity);

}
