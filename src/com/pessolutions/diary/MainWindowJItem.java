package com.pessolutions.diary;

import javax.swing.*;
import java.io.*;

public class MainWindowJItem extends JMenuItem implements ManageFile {

    MainWindowJItem() {

        super();
    }

    MainWindowJItem(String name){

        super();

        setText(name);
    }

    @Override
    public void openFile(JTextArea textArea) {

        synchronized (this) {

            JFileChooser fileChooser = new JFileChooser();

            int acceptVal = fileChooser.showOpenDialog(fileChooser);

            if (acceptVal == JFileChooser.APPROVE_OPTION) {

                File file = new File(fileChooser.getSelectedFile().getPath());

                try (Reader reader = new BufferedReader(new FileReader(file))) {

                    textArea.read(reader, file);

                } catch (IOException e) {

                    e.printStackTrace();

                }
            }
        }
        }

        @Override
        public void closeFile () {

        }

        @Override
        public void saveFile () {

        }

}