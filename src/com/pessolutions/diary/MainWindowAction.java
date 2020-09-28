package com.pessolutions.diary;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.io.*;


public class MainWindowAction {

    private static boolean fileSaved = false;

  private final static JFileChooser fileChooser = new JFileChooser();

  private static File file;

   static public synchronized ActionListener setOpenAction(JTextArea textArea) {

       return e -> {

          /* if (!fileSaved && !(textArea.getText().equals(""))){

               JOptionPane.showMessageDialog(textArea, "Save your current changes");

               return;
           }*/

           int acceptVal = fileChooser.showOpenDialog(fileChooser);

           if (acceptVal == JFileChooser.APPROVE_OPTION) {

               file = fileChooser.getSelectedFile();

               fileSaved = false;

               try (Reader reader = new BufferedReader(new FileReader(file))) {

                   textArea.read(reader, file);

               } catch (IOException ex) {

                   ex.printStackTrace();

               }
           }
       };
}

static public synchronized ActionListener setSaveAsAction(JTextArea textArea){

    return e -> {


        int actionDialog = fileChooser.showSaveDialog(fileChooser);

        if (actionDialog == JFileChooser.APPROVE_OPTION) {

            fileSaved = true;

            file = new File(fileChooser.getSelectedFile().getPath());

            try (Writer writer = new BufferedWriter(new FileWriter(file))) {

                writer.write(textArea.getText());

            } catch (IOException er) {

                er.printStackTrace();
            }
        }

        };
}

static public ActionListener setExitAction(JTextArea textArea){


       if (fileSaved){

           JOptionPane.showConfirmDialog(textArea, "Do you want to save current changes ?");
       }

    return e -> System.exit(0);

}

static public synchronized ActionListener setSaveAction (JTextArea textArea){

       return e -> {

           fileSaved = true;

           if (!(file == null)){

           file = fileChooser.getSelectedFile();

           }else{

                try {

                    file = File.createTempFile("New File", ".txt", new File(fileChooser.getCurrentDirectory().getPath()));

                    fileChooser.setSelectedFile(file);

                }catch (IOException er){

                    er.printStackTrace();

                }
           }

           try(Writer writer = new BufferedWriter(new FileWriter(file))){

               writer.write(textArea.getText());

           } catch (IOException ep){

               ep.printStackTrace();
           }

       };
}
static public ActionListener newFileAction(JTextArea textArea){

       return e -> {

           if (!textArea.getText().equals("")){

               int acVal = JOptionPane.showConfirmDialog(textArea, "Do you want to save this file ?");

               if (acVal == JOptionPane.OK_OPTION){

                   try {

                       file =  File.createTempFile("New File", ".txt", new File(fileChooser.getCurrentDirectory().getPath()));

                   }catch (IOException filePrikol) {

                       filePrikol.printStackTrace();

                       JOptionPane.showMessageDialog(textArea, "Can't crete file");
                   }

                   try (Writer newWriter = new BufferedWriter(new FileWriter(file))) {

                       newWriter.write(textArea.getText());

                       textArea.setText("");

                   }catch (IOException fileEx){

                       fileEx.printStackTrace();
                   }
               }

           }

       };
}
}