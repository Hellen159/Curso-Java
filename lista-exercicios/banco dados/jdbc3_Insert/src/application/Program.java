package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		 Connection conn = null;
		 PreparedStatement st = null;
		 try {
			 conn = DB.getConnection();
			 st = conn.prepareStatement(
					 "INSERT INTO department"
					 + "(Id, Name )"
					 + "VALUES"
					 + "(?, ?)",
					 java.sql.Statement.RETURN_GENERATED_KEYS);
			st.setInt(1, 5);
			st.setString(2, "Montreal");
			
			
			int rowsAffected = st.executeUpdate();
			
			if (rowsAffected>0) {
				ResultSet rs= st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done ! ID:" + id);
				}
			}
			
			System.out.println("Done ! Rows affected:" + rowsAffected);
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 finally {
			 DB.closeStatement(st);
			 DB.closeConnection();
		 }
	}

}
