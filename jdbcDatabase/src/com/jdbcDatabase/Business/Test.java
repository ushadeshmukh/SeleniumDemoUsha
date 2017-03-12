package com.jdbcDatabase.Business;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		CRUDOperation crd = new CRUDOperation();

		/*Scanner sc = new Scanner(System.in);

		Student s = new Student();

		String name;

		s.setId(sc.nextInt());
		s.setName(sc.next());
		s.setMarks(sc.nextInt());
		crd.insertRecor(UtilityClass.getConnection(), s);*/

		crd.displayRecord(crd.retriveRecord(UtilityClass.getConnection()));
	}

}
