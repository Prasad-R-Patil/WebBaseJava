package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Student;

public class StudentDao {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Connection con = null;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Prasad@0102");
		return con;
	}
	
	public static int registerStudent(Student s)
	{
		int i=0;
		
		try {
			Connection con = getConnection();
			
			PreparedStatement stmt = con.prepareStatement("INSERT INTO student (prn,name,c_marks,cpp_marks,java_marks) values (?,?,?,?,?)");
			stmt.setInt(1,s.getPrn());
			stmt.setString(2, s.getName());
			stmt.setFloat(3, s.getS1());
			stmt.setFloat(4, s.getS2());
			stmt.setFloat(5, s.getS3());
			i = stmt.executeUpdate();
			return i;
		}
		catch(Exception e)
		{
			return i;
		}
	}
	
	public static Student getStudentByPrn(int prn) throws ClassNotFoundException, SQLException
	{
		Student s= new Student();
		
		Connection con = getConnection();
		
		PreparedStatement stmt = con.prepareStatement("SELECT * FROM Student where prn=?");
		
		stmt.setInt(1, prn);
		
		ResultSet rs = stmt.executeQuery();
		
		boolean status = rs.next();
		
//		System.out.println(rs.getInt(2)+" "+rs.getString(3));
//		System.out.println(status);
		
		if(status)
		{
			s.setId(rs.getInt(1));
			s.setPrn(rs.getInt(2));
			s.setName(rs.getString(3));
			s.setS1(rs.getFloat(4));
			s.setS2(rs.getFloat(5));
			s.setS3(rs.getFloat(6));
			
		}
		return s;
	}
	

}
