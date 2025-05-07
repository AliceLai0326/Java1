package tw.com.JAVA;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

import tw.brad.apis.BCrypt;

public class JDBC13 {
	private static final String URL = "jdbc:mysql://localhost/brad"; 
	private static final String USER = "root";
	private static final String PASSWD = "";
	private static Connection conn;
	private static final String UPDATE_SQL = 
		"UPDATE member SET icon = ? WHERE id = ?";
	

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		try {
			conn = DriverManager.getConnection(URL, prop);
			PreparedStatement pstmt = conn.prepareStatement(UPDATE_SQL);
			
			FileInputStream fin = new FileInputStream("dir1/ball.png");
			
			pstmt.setBinaryStream(1, fin);
			pstmt.setInt(2, 1);
			if (pstmt.executeUpdate()>0) {
				System.out.println("Success");
			}else {
				System.out.println("Failure");
			}
			
			fin.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	

}