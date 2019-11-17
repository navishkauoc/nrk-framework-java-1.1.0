package com.navishkakularathna.frameworknrk.demo;

import com.navishkakularathna.frameworknrk.CommonController;

public class Demo {
	public static void main(String args[]) {
		Student student = new Student();
		student.id = 1;
		student.name = "Nicky Barnes";
		student.nic = "234567235g";
		student.email = "nickyb@gmail.com";
		student.mobile = "0772344563";
		
		CommonController.insert(student);
	}
}
