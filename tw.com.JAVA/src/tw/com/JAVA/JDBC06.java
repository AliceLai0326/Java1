package tw.com.JAVA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/*
 * https://data.moa.gov.tw/Service/OpenData/ODwsv/ODwsvAgriculturalProduce.aspx
 */
public class JDBC06 {
	private static final String url = "jdbc:jdbc:mysql://localhost/brad";
	private static final String USER = "root";
	private static final String PASSWD = "";
	private static final String SQL = "INSERT INTO cust (cname, tel, birthday)" + "VALUES (?, ?, ?)";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("name: ");
		String nanme = scanner.next();
		System.out.print("Tel: ");		
		String tel = scanner.next();
		System.out.print("Birthday: ");		
		String birthday = scanner.next();
		
		
		Properties prop = new Properties();
		prop.put("user", USER);
		prop.put("password", PASSWD);
		try {
			Connection conn = DriverManager.getConnection(url, prop);
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, "eric");
			pstmt.setString(2, "333");
			pstmt.setString(3, "1999-03-04");
			
			if (pstmt.executeUpdate() > 0 ) {
				System.out.println("Success");
			} else {
				System.out.println("Failure:" + SQL);
			}
			
			System.out.println("Finish");

			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}