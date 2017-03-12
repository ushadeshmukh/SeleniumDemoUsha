package com.jdbcDatabase.Business;

import java.sql.Connection;

public interface StudentInterface {

	public void insertRecor(Connection con, Student stud);

	public Student[] retriveRecord(Connection con);

	public void displayRecord(Student [] a);

}
