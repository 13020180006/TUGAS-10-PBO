/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 09 Mei 2020
Waktu   : 16.50 WITA
*/

package tugas10;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.util.logging.Level; 
import java.util.logging.Logger;

public class DatabaseUtilities {

    private static Connection con;
    public static Connection getConnection(){ 
        if(con==null){ 
            try { 
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbakademik","root","");             
            } catch (SQLException ex) { 
                Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, ex);  
            }
        } 
        return con;
    }
}

