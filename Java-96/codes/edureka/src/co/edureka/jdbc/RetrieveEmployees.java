package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			//float sal = rs.getFloat(3);
			float sal = rs.getFloat("sal");
			
			String emp = String.format("Employee[%-3d | %-10s | %.2f]", eno, name, sal);
			System.out.println(emp);
			Thread.sleep(2000);
		}
		
		rs.close();
		st.close();
		con.close();
	}

}
