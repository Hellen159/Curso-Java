package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			st = conn.prepareStatement("UPDATE seller "
										+ "SET BaseSalary = BaseSalary + ? "
										+ " WHERE "
										+ "(DepartmentId = ?)");
			
			st.setDouble(1, 300);
			st.setInt(2, 4);
			int rowsAffected = st.executeUpdate();
			System.out.println("Rows affected: " + rowsAffected);
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
	}

}
}
