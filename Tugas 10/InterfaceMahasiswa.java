/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Sabtu, 09 Mei 2020
Waktu   : 17.17 WITA
*/
package tugas10;

import java.sql.SQLException; 
import java.util.List;

public interface InterfaceMahasiswa {
    Mahasiswa insert(Mahasiswa o) throws SQLException;
    void update(Mahasiswa o) throws SQLException;
    void delete(String nim) throws SQLException;
    List getAll() throws SQLException;


}
