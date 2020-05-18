
package tugas10;

import java.sql.Connection;
public class DatabaseUtilitiesMain {
    Connection con;
    public DatabaseUtilitiesMain(){
        con = DatabaseUtilities.getConnection();
    }
    public static void main(String[] args){
        DatabaseUtilitiesMain obj = new DatabaseUtilitiesMain();
    }
    
}
