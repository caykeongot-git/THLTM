package thuchanh1;

import java.sql.*;
import javax.swing.*;

public class MyConnection {
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // driver cho mysql 8 tren java 21
            
            // dinh nghia toa do db moshiDB
            String url = "jdbc:mysql://localhost:3006/moshiDB?useUnicode=true&characterEncoding=UTF-8";
            String user = "root";
            String pass = ""; //default
            
            con = DriverManager.getConnection(url, user, pass); // xuly ketnoi va mo pipeline giaotiep          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi ket noi DB: " + e.getMessage(), "Loi", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
