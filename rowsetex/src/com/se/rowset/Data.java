package com.se.rowset;

import java.sql.SQLException;

import javax.sql.*;

public class Data {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyClass m=new MyClass();
		RowSet r=m.getData();
		while(r.next()){
			
			System.out.println(r.getString(1));
			System.out.println(r.getString(2));
			System.out.println(r.getString(3));
			System.out.println("success");
			
			
		}
		
		
		
		
	}

}
