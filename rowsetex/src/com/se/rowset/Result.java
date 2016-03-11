package com.se.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Result {
	ResultSet rs;
	public ResultSet getData(){
		
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dhana","dhana");
		
		Statement st=con.createStatement();
		 rs=st.executeQuery("select * from emp");
		}catch(Exception e){
			
			
		}
		return rs;
	}
	
	

}
