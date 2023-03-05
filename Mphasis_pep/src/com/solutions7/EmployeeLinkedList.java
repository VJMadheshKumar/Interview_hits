package com.solutions7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class EmployeeLinkedList {

	private List<Employee> employees = new LinkedList<>();
	
	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		
		EmployeeLinkedList call = new EmployeeLinkedList();
		boolean flag = true;
		
		while (flag) {
			System.out.println("choose your operation ");
			System.out.println("1.Add Employee"
					+ "\n2.Display Employee"
					+ "\n3.To quit");
			System.out.print("Enter your choice : ");
			int key = io.nextInt();

		switch (key) {
		
			case 1:
				//if (true) {
				if (call.addEmployee()) {
					System.out.println("employee details added");
				}
				else {
					System.out.println("Employee details already exist");
				}
					break;
				//}
//				else {
//					System.out.println("Employee number already exist");
//					break;
//				}
		case 2:
				call.showEmployees();
				break;
			case 3:
				flag = false;
				break;
			default:
				break;
			}	
		}
		
	}
	
	
	void showEmployees(){
		Iterator<Employee> fIterator = employees.iterator();
		System.out.println("printing forward");
		while (fIterator.hasNext()) {
			System.out.println(fIterator.next());
		}
		
		ListIterator<Employee> rIterator = employees.listIterator(employees.size());
		System.out.println("Printing reverse");
		while (rIterator.hasPrevious()) {
			System.out.println(rIterator.previous());
		}
		
	}
	
	
	boolean addEmployee() {
		Scanner io = new Scanner(System.in);
		Employee emp = new Employee(null, null, null);
		System.out.println("Enter employee id : ");
		String id = io.nextLine();
		System.out.println("id"+id);
		System.out.println("Enter employee name : ");
		String name = io.nextLine();
		System.out.println("name"+name);
		System.out.println("Enter employee address");
		String address = io.nextLine();
		System.out.println("address"+address);
		 if (check( id)) {
			emp.setEmpId(id);
			emp.setEmpName(name);
			emp.setEmpAddress(address);
			employees.add(emp);
			return true	;
		}
		return false;
		
	}
	
	boolean check (String id) {
		boolean flag2 = true;
		Iterator<Employee> iterator = employees.iterator();
		if (employees.size()>0) 
			
		while (iterator.hasNext()) {
			if (iterator.next().getEmpId().equals(id)) {
				flag2 = false;
			}
			
			if (flag2==false) {
				break;
			} 
		}return flag2;
	}
}
