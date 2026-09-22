package thuchanh1;


public class ThucHanh1 {

    public static void main(String[] args) {
        MyConnection myCon =  new MyConnection();
        if (myCon.getConnection() != null) System.out.println("SUCCESS");
        else System.out.println("FAIL");
    }
}