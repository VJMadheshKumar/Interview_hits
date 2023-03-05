package net.codejava.sql;

import java.sql.*;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:sqlserver://sqlsrv\\sqlexpress;databaseName=zohodb";
		String user = "root";
		String password = "rootuser";
		
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection estabilished");
		} 
		catch(SQLException e){
			System.out.println("something wrong");
		}

	}

}
