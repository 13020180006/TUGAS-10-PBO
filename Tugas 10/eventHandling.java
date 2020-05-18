/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 09 Mei 2020
Waktu   : 15.12 WITA
*/
package tugas10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class eventHandling extends JFrame implements ActionListener{
    JButton tombol;
    JTextArea myTextArea;
    
    public eventHandling(){
        super("EVENT HANDLING (PARAMADINA)");
        setLayout(new BorderLayout());
        
        myTextArea = new JTextArea();
        tombol = new JButton("CLICK ME!");

        tombol.addActionListener(this);
        
        add(myTextArea, BorderLayout.CENTER);
        add(tombol, BorderLayout.SOUTH);
        
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        myTextArea.append("Hello! Terima kasih telah menekan tombol tersebut\n");
    }
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new eventHandling();
            }
        });
    }
}


