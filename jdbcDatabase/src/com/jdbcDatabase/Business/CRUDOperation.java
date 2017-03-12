package com.jdbcDatabase.Business;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDOperation implements StudentInterface {

	public void insertRecor(Connection con, Student stud) {

		try {
			PreparedStatement ps = con.prepareStatement("insert into student values (?,?,?)");
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
			ps.setInt(3, stud.getMarks());

			int i = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Student[] retriveRecord(Connection con) {
		try {
			PreparedStatement ps = con.prepareStatement("select * from student");

			ResultSet rs = ps.executeQuery();
			Student[] s = new Student[8];
			Student s1 = new Student();
			int i = 0;
			 {
				while (rs.next()) {
					s1.setId(rs.getInt(1));
					s1.setName(rs.getString(2));
					s1.setMarks(rs.getInt(3));
					s[i++] = s1;

				}
			}
			return s;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void displayRecord(Student[] a) {

		
		for (Student student : a) {
			if(student==null){
				
			}else
			{
				System.out.println(student);

			}
		}
	}

	

}
