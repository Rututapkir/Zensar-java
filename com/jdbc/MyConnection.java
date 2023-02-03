package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MyConnection {
	public static void main(String args[]) {
	MyConnection.getConnection();
	
	}
	static public void getConnection() {
	try {
		System.out.println("In getConnection");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded");
		
		String cs ="jdbc:mysql://localhost:3306/dbzensar";
		//cs is the connection string ,"root" is the username of database 'Manav@05' is the password 
		Connection con = DriverManager.getConnection(cs, "root", "balasaheb@123");
		System.out.println("Connection Established");
		
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate("insert ignore into employee values(104,'Tam',40);");
		if (i>0) {
			System.out.println("Record inserted Successfully");
		}else {
			System.out.println("Record Not Inserted Successfully");
		}
		int j = stmt.executeUpdate("update employee set ename='Manav_Muthe',salary=100 where eid =101;");
		if (j>0) {
			System.out.println("Record Updated Successfully");
		}else {
			System.out.println("Record Not Updated Successfully");
		}
		int k = stmt.executeUpdate("Delete from employee where eid=103");
		if (k>0) {
			System.out.println("Record Deleted Successfully");
		}else {
			System.out.println("Record Not Deleted Successfully");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}