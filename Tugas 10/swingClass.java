/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 09 Mei 2020
Waktu   : 14.42 WITA
*/
package tugas10;

import javax.swing.*;
import java.awt.*;

public class swingClass {
   JFrame frame;
   JPanel panel;
   JTextField textField;
   JButton button;
   Container cont;
   
   void Frame(){
       frame = new JFrame("Swing Class (Paramadina)");
       panel = new JPanel();
       textField = new JTextField("Pemrograman Berorientasi Objek");
       button = new JButton("Click This Button!");
       cont = frame.getContentPane();
       
       panel.add(textField);
       panel.add(button);
       
       cont.add(panel, BorderLayout.CENTER);
       frame.pack();
       frame.setVisible(true);
       
   }
   public static void main(String[] args){
       swingClass swing = new swingClass();
       swing.Frame();
       
   }
}
