package com.pessolutions.diary;

import javax.swing.*;
import java.awt.*;

public class WindowTextArea extends JTextArea {

    WindowTextArea(){

        setLayout(null);

        setFont(new Font("Arial", Font.BOLD, 18));

        setLineWrap(true);

    }

}
