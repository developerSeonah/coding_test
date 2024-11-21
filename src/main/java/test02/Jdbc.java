package test02;

import java.sql.*;

public class Jdbc {
    private static final String Driver = "oracle.jdbc.driver.oracleDriver";
    private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String userName = "SYSTEM";
    private static final String password = "1234";

    public static Connection connect(){
        Connection conn = null;
        try{
            Class.forName(Driver);
        }catch (ClassNotFoundException e){
            System.out.println("드라이버 연결 실패");
        }

        try{
            conn=DriverManager.getConnection(url,userName,password);
        }catch(SQLException e){
            System.out.println("conn 연결 실패");
        }
        return conn;
    }

    public static void disconnect(PreparedStatement pstmt, Connection conn){
        try{
            pstmt.close();
            conn.close();
        }catch(SQLException e){
            System.out.println("연결 해제 실패");
        }
    }
}
