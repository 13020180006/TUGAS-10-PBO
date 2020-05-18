/*
Nama    : Paramadina Mulya Majid
Stambuk : 13020180006
Tgl/Hari : Senin, 10 Mei 2020
Waktu   : 14.56 WITA
*/
package tugas10;

import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.ArrayList; 
import java.util.List;

public class ImplementMahasiswa implements InterfaceMahasiswa{
    @Override
    public Mahasiswa insert(Mahasiswa o) throws SQLException {
        PreparedStatement
        st=DatabaseUtilities.getConnection().prepareStatement ("insert into mahasiswa values(?,?,?)"); 
        st.setString(1, o.getNim()); 
        st.setString(2, o.getNama()); 
        st.setString(3, o.getAlamat()); 
        st.executeUpdate(); 
        return o; 
    }
    @Override
    public void update(Mahasiswa o) throws SQLException {
        PreparedStatement 
        st=DatabaseUtilities.getConnection().prepareStatement("update mahasiswa set nama=?,alamat=? where nim=?");
        st.setString(1, o.getNama()); 
        st.setString(2, o.getAlamat()); 
        st.setString(3, o.getNim()); 
        st.executeUpdate();
    }
    @Override
    public void delete(String nim) throws SQLException {
        PreparedStatement 
        st=DatabaseUtilities.getConnection().prepareStatement("delete from mahasiswa where nim=?"); 
        st.setString(1, nim); 
        st.executeUpdate(); 
    }
    @Override
    public List getAll() throws SQLException { 
        Statement st = DatabaseUtilities.getConnection().createStatement(); 
        ResultSet rs=st.executeQuery("select * from mahasiswa"); 
        List list=new ArrayList(); 
        while(rs.next()){ 
            Mahasiswa mhs=new Mahasiswa(); 
            mhs.setNim(rs.getString("nim")); 
            mhs.setNama(rs.getString("nama")); 
            mhs.setAlamat(rs.getString("alamat")); 
            list.add(mhs); 
        } 
        return list; 
    } 

}
