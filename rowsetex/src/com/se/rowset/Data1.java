package com.se.rowset;


import java.sql.*;
public class Data1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
		Result r=new Result();
		ResultSet rs=r.getData();
		
		while(rs.next()){
			
			
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
		}
}catch(Exception e){
	
}
	}

}
