package Graphics;

import java.sql.*;

public class DataBaseTest{
	public static void main(String [] args) {
		
		

	try (
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/fuoye_medical?serverTimezone=UTC","root", "B.blessing2");
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/","mysql80", "B.blessing2");
			
			Statement stmt = conn.createStatement();
			) {
			
			String strSelect = "select patient_id, process from history";
			System.out.println("The SQL statement is: " + strSelect + "\n");
			ResultSet rset = stmt.executeQuery(strSelect);
			
			System.out.println("The records selected are:");
			
			int rowCount = 0;
			
			while(rset.next()) {
			int title = rset.getInt("patient_id");
			String price = rset.getString("process");
			System.out.println(title + ", " + price);
			++rowCount;
			}
			
			System.out.println("Total number of records = " + rowCount);
			} catch(SQLException ex) {
			ex.printStackTrace();
			}
	}
}
