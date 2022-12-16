package week2.assignment2;

public class EmployeeDetails {
	public void employeeName(String empName,int empId) {
		System.out.println(empName);
		System.out.println(empId);
	}
	public void employeeAddress(String empAddress) {
		System.out.println(empAddress);
	}
	public void employeeSalary(double empSalary) {
		System.out.println(empSalary);
	}
	public void employeeMobileNumber(long MobNum) {
		System.out.println(MobNum);
	}                                                                 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails emp=new EmployeeDetails();
emp.employeeName("affreen", 1);
		emp.employeeAddress("avadi");
		emp.employeeSalary(10000);
emp.employeeMobileNumber(9632587414l);

	}}
