package com.hrms.testscripts;

import com.hrms.LIB.General;

public class TC_HRMS_001 extends General{
	public static void main(String[]args) throws InterruptedException {
		//create object for "General" class
		General gl=new General();
		//test cases calling
		gl.Setup();
		gl.adminLogin();
		gl.addEmp();
		gl.delEmp();
		gl.adminLogout();
		gl.TearDown();
		
	}
	

}
