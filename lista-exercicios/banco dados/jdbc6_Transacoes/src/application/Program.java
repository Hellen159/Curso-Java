package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DB.getConnection();
			//Commit so é realizado com o comando explicito do programador
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			int rows1 = st.executeUpdate("UPDATE seller "+
										"set BaseSalary = 2090 "+
										"WHERE DepartmentId = 1");
			
			//int x =1;
			//if (x<2) {
			//	throw new SQLException("FAKE ERROR");
			//}
			
			
			int rows2 = st.executeUpdate("UPDATE seller "+
					"set BaseSalary = 3090 "+
					"WHERE DepartmentId = 2");
			//Confirmacao da transacao
			conn.commit();
			
			System.out.println("rows1:"+rows1);
			System.out.println("rows2:"+rows2);
		}
		catch(SQLException e){
			try {
				conn.rollback();
				throw new DbException("Rollback na transacao! Causada por: " + e.getMessage());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				throw new DbException("Erro no rollback!Causada por: "+e1.getMessage());
			}
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
	}

}
}
