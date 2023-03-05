package com.solutions7;

public class Employee {
	private String empId;
	private String empName;
	private String empAddress;
	
	public Employee(String id,String name,String address) {
		this.empId =id;
		this.empName=name;
		this.empAddress=address;
	}
	
	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public String getEmpId() {
		return empId;
	}



	public void setEmpId(String empId) {
		this.empId = empId;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}


	
}
