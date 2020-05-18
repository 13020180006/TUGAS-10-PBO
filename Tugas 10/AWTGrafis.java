/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 09 Mei 2020
Waktu   : 14.12 WITA
*/
package tugas10;

import java.awt.*; 

public class AWTGrafis extends Panel {
     AWTGrafis() { 
         setBackground(Color.white);
     } 
     @Override
     public void paint(Graphics g) { 
        g.setColor(new Color(139,101,8));
        g.setFont(new Font("Agency FB",Font.PLAIN,24)); 
        g.drawString("Paramadina Mulya Majid", 200, 100); 
        g.setFont(new Font("Adobe Gothic Std B",Font.PLAIN,24)); 
        g.drawString("13020180006", 215, 130); 
        g.setColor(new Color(255,106,106));
        g.fillRect(30, 100, 150, 10); 
        g.setColor(new Color(255,106,106)); 
        g.fillRect(400, 100, 150, 10); 
    } 
     public static void main(String args[]) { 
         Frame f = new Frame("AWT Grafis Test");
         AWTGrafis gp = new AWTGrafis();
         f.add(gp);
         f.setSize(600, 300); 
         f.setVisible(true); 

}
}
