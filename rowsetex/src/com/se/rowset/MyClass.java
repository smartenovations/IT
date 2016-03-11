package com.se.rowset;

import java.sql.*;
import javax.sql.rowset.*;
import javax.sql.*;

public class MyClass {
	JdbcRowSet rowSet;
	public RowSet getData() {
		// TODO Auto-generated method stub
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","dhana","dhana");
		
		
		rowSet = RowSetProvider.newFactory().createJdbcRowSet();  
        rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:xe");  
        rowSet.setUsername("dhana");  
       rowSet.setPassword("dhana");  
                   
        rowSet.setCommand("select * from emp where eno=1");  
        rowSet.execute();  
                   
   
		
		}catch(Exception e){
			
		}
	return rowSet;	
	}

}
