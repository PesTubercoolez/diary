package com.pessolutions.diary;

import javax.swing.*;

public class WindowHandler {

    public static void runFrame(){

        SwingUtilities.invokeLater(() -> {

            MainWindow window = new MainWindow();

        });
    }



}
