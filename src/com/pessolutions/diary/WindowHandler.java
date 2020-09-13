package com.pessolutions.diary;

import javax.swing.*;

public class WindowHandler extends MainWindow{


    public void runFrame(){

        SwingUtilities.invokeLater(WindowHandler.super::frameInit);
    }
}
