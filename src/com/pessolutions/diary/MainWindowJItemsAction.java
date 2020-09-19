package com.pessolutions.diary;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindowJItemsAction implements ActionSetter {

    private int actionQuantity;

    @Override
    public void actionSet(JMenuItem menuItem, int actionQuantity) {

        this.actionQuantity = actionQuantity;

        switch (this.actionQuantity){

            case 1:
                menuItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });

                break;

            case 2:
                menuItem.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                break;
        }


    }
}
