//create the  project Employee1
package org.emp1;
//create the class EmployeeInfo1
public class EmployeeInfo1 {
	
	//data initialisation
	int emp1 = 123456;
	String ename = "psd";
	String ename1="jps";
	
	//create the 1st method empId
	private void empId() {
		System.out.println("employeeid : "+emp1);
	}
	//create the 2nd method empName
	private void empName() {
		System.out.println("employeename : "+ename);
	}
	//create the 3nd method empName
		private void empName1() {
			System.out.println("employeename : "+ename1);
		}
	//create the main method 
	public static void main(String[] args) {
		//classname objrefname = new classname()
		EmployeeInfo1 ei1 = new EmployeeInfo1();
		ei1.empId();
		ei1.empName();
		ei1.empName1();
	}
	
	

}
