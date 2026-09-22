package thuchanh1;

import java.sql.*;

public class DBAccess {
    private Connection con;
    private Statement stmt;
    
    // constructor auto tao ketnoi va statement
    public DBAccess() {
        try {
            MyConnection myCon = new MyConnection();
            con = myCon.getConnection();
            if (con != null) stmt = con.createStatement();
        } catch (Exception e) {e.printStackTrace();}
    }
    
    // ham update de insert update delete
    public int Update (String sql) {
        try {
            int i = stmt.executeUpdate(sql);
            return i; // return ve so dong duoc them/sua (>0 AC)
        } catch (Exception e) {
            e.printStackTrace();
            return -1; // failt
        }
    }
    
    // ham truy van, doc data
    public ResultSet Query(String sql) {
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs; // return ve danh sach data trong bang
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
