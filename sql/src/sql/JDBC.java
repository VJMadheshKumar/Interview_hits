package sql;

import java.sql.*;
import java.util.Scanner;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

public class JDBC {
	private static Scanner io = new Scanner(System.in);
	private static SQLServerDataSource sqlDs = new SQLServerDataSource();
	private static Connection con = null;
	public static void main(String[] args) throws SQLServerException {
		            
		sqlDs.setIntegratedSecurity(false);
		sqlDs.setUser("root");
		sqlDs.setPassword("rootuser");
		sqlDs.setServerName("DESKTOP-5B8CM41\\SQLEXPRESS");
		sqlDs.setPortNumber(1433); 
		sqlDs.setDatabaseName("zohodb");
		
		con = sqlDs.getConnection();
		JDBC emp = new JDBC();
		
		
		try{
			
			System.out.println("connected");
			String sql = "select * from employee";
			
			PreparedStatement ps1 = con.prepareStatement(sql);
			//ResultSet result =ps1.executeQuery();
			
			ResultSet result =ps1.executeQuery();
			
			/*if(result.next()) {
				int id = result.getInt("ID");
				String name = result.getString("Name");
				String city = result.getString("Age");
				String email = result.getString("Salary");
				System.out.println("Employee ID      :"+id+"\n"+
								   "Employee Name    :"+name+"\n"+
								   "Employee Age :"+city+"\n"+
								   "Employess salary  :"+email+"\n");
			}*/
			
			
			boolean flag = true;
			while(flag) {
				
				
			System.out.println("Enter the choice given below");
			System.out.println("1:Empoyee joined in the year of 2022");
			System.out.println("2:Employee Count by Department Wise");
			System.out.println("3:Average salary of employees department wise");
			System.out.println("4:Min and Max Salaries department wise");
			System.out.println("5:Overall Salary of the employees in the organization");
			System.out.println("6:Employees who own more than 3 vehicles");
			System.out.println("7:Employees who don't have any Vehicles");
			System.out.println("8:Employees who have Suzuki Company Vehicles");
			System.out.println("9:Details of max salary Employee department wise");
			System.out.println("10:Employees whose name Starts with 'S' and ends with 'v'.");
			System.out.println("11:Employees from both Employees and WeekendShiftEmployees tables");
			System.out.println("12:Top 3 Salary earning employees");
			System.out.println("13:Second highest salary from Employees table");
			System.out.println("14:Press 14 to quit");
			
			System.out.print("Your choice:");
			int choice = Integer.parseInt(io.nextLine());
			
			switch (choice) {
			case 1:
				emp.year();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 2:
				emp.dSal();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 3:
				emp.dAvgSal();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 4:
				emp.dMinMax();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 5:
				emp.OverSal();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 6:
				emp.threeVcl();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 7:
				emp.noVcl();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 8:
				emp.suzuki();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 9:
				emp.MaxSald();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 10:
				emp.nameLike();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 11:
				emp.bothShft();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 12:
				emp.topThree();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 13:
				emp.secondSal();
				System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
				break;
			case 14:
				flag = false;
				System.out.println("Quit successfully");
				break;
			}
		  }
			
			
			
		}	
		catch(Exception e){
			throw new RuntimeException("something went wrong");
		}

	}
	
	public void year() throws SQLException{
		
		String sql = "select * from employee where YEAR(joiningdate)=2022;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet result =ps.executeQuery();

		while(result.next()) {
			int id = result.getInt("ID");
			String name = result.getString("Name");
			String dep = result.getString("Department");
			String mn = result.getString("MobileNumber");
			int salary = result.getInt("Salary");
			System.out.println("Employee ID      :"+id+"\n"+
							   "Employee Name    :"+name+"\n"+
							   "Employee Department :"+dep+"\n"+
							   "Employess MobileNumber  :"+mn+"\n"+
							   "Employess Salary         :"+salary+"\n");
			System.out.println("--------------------------------------------------");
			
		}
		
		
		
	}

	
	public void dSal() throws SQLException{
		
		String sql = "select  Department, count(ID) as Employeecount from employee group by department;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet result =ps.executeQuery();

		while(result.next()) {
			int count = result.getInt("Employeecount");
			//String name = result.getString("Name");
			String dep = result.getString("Department");
			//String mn = result.getString("MobileNumber");
			//int salary = result.getInt("Salary");
			System.out.println("Department              :"+dep+"\n"+
							   "Employee Count          :"+count+"\n");
			System.out.println("--------------------------------------------------");
			
		}
		
		
		
	}
	
	public void dAvgSal() throws SQLException{
		
		String sql = "select  Department, avg(salary) as AverageSalary from employee group by department;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet result =ps.executeQuery();

		while(result.next()) {
			int Asal = result.getInt("AverageSalary");
			//String name = result.getString("Name");
			String dep = result.getString("Department");
			//String mn = result.getString("MobileNumber");
			//int salary = result.getInt("Salary");
			System.out.println("Department              :"+dep+"\n"+
							   "Average Salary          :"+Asal+"\n");
			System.out.println("--------------------------------------------------");
			
		}
		
		
		
	}
	
	
	public void dMinMax() throws SQLException{
		
		String sql = "select  Department, min(salary) as Minimumsalary, "
				+ "max(salary) as Maximumsalary from employee group by department;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet result =ps.executeQuery();

		while(result.next()) {
			int Minsal = result.getInt("Minimumsalary");
			int Maxsal = result.getInt("Maximumsalary");
			//String name = result.getString("Name");
			String dep = result.getString("Department");
			//String mn = result.getString("MobileNumber");
			//int salary = result.getInt("Salary");
			System.out.println("Department              :"+dep+"\n"+
							   "Minimum Salary          :"+Minsal+"\n"+
							   "Maximun Salary          :"+Maxsal);
			System.out.println("--------------------------------------------------");
			
		}
		
		
		

	}
	
	
	public void OverSal() throws SQLException{
		
		String sql = "select sum(salary) as OverallSalary from employee;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet result =ps.executeQuery();

		while(result.next()) {
			int Ovrsal = result.getInt("OverallSalary");
			//int Maxsal = result.getInt("Maximumsalary");
			//String name = result.getString("Name");
			//String dep = result.getString("Department");
			//String mn = result.getString("MobileNumber");
			//int salary = result.getInt("Salary");
			System.out.println("The over all salary of this organization is "+Ovrsal+"\n");
			System.out.println("--------------------------------------------------");
		}
		
		
		
	}
	
	
	public void threeVcl() throws SQLException{
		
		String sql = "select employee.name , count(EmployeeID) as Vcount from EmpVehicles  join employee on Employee.id = EmpVehicles.EmployeeID"
				+ " group by EmployeeID , employee.name having count(EmployeeID)>2;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet result =ps.executeQuery();
		System.out.println("Employee having more than 3 vehicals");
		while(result.next()) {
			int vcount = result.getInt("Vcount");
			//String name = result.getString("Name");
			String name = result.getString("name");
			//String mn = result.getString("MobileNumber");
			//int salary = result.getInt("Salary");
			System.out.println("Employee Name              :"+name+"\n"+
							   "Vehical Count          :"+vcount+"\n");
			System.out.println("--------------------------------------------------");
		}
		
		
		
	}

public void noVcl() throws SQLException{
		
		String sql = "select  Name , ID from Employee left join EmpVehicles on Employee.id = EmpVehicles.EmployeeID\r\n"
				+ "where EmployeeID is null ;";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet result =ps.executeQuery();
		System.out.println("Employee having no vehicals");
		while(result.next()) {
			int id = result.getInt("ID");
			//String name = result.getString("Name");
			String name = result.getString("Name");
			//String mn = result.getString("MobileNumber");
			//int salary = result.getInt("Salary");
			System.out.println("Employee  ID      :"+id+"\n"+
							   "Employee  Name    :"+name);
			System.out.println("--------------------------------------------------");
			
		}
		
		
		
	}
	
public void suzuki() throws SQLException{
	
	String sql = "select Employee.name , EmployeeID ,VehicleCmp from EmpVehicles join Employee on"
			+ " Employee.id = EmpVehicles.EmployeeID where VehicleCmp = 'Suzuki';";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet result =ps.executeQuery();
	//System.out.println("Employee having no vehicals");
	while(result.next()) {
		int id = result.getInt("EmployeeID");
		//String name = result.getString("Name");
		String name = result.getString("name");
		String vcmp = result.getString("VehicleCmp");
		//int salary = result.getInt("Salary");
		System.out.println("Employee  ID      :"+id+"\n"+
						   "Employee  Name    :"+name+"\n"+
						   "Vehical   Nmae    :"+vcmp);
		System.out.println("--------------------------------------------------");
		
	}
	
	
	
}


public void MaxSald() throws SQLException{
	
	String sql = "select e.id , e.name , e.department ,e.salary from employee e join (select department,max(salary) salary from employee group by department )d on e.department = d.department and e.salary = d.salary";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet result =ps.executeQuery();
	System.out.println("Maximum salary department wise");
	while(result.next()) {
		int id = result.getInt("id");
		String dep = result.getString("department");
		String name = result.getString("name");
		//int salary = result.getInt("Maximumsalary");
		//String vcmp = result.getString("VehicleCmp");
		int salary = result.getInt("Salary");
		System.out.println( "ID :"+id+"\n"+
				            "Name :"+name+"\n"+
							"Department     :"+dep+"\n"+
						   "Salary :"+salary+"\n");
		System.out.println("--------------------------------------------------");
		
	}
	
	
	
}

public void nameLike() throws SQLException{
	
	String sql = "select ID, Name, department from employee where name like ('S%') and name like ('%v');";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet result =ps.executeQuery();
	System.out.println("Employee Name starts with S and ends with v");
	while(result.next()) {
		String dep = result.getString("department");
		String name = result.getString("Name");
		int id = result.getInt("ID");
		//String vcmp = result.getString("VehicleCmp");
		//int salary = result.getInt("Salary");
		System.out.println("Employee ID      :"+id+"\n"+
						   "Employee Name    :"+name+"\n"+
						   "Employee Department   :"+dep+"\n");
		System.out.println("--------------------------------------------------");
	}
	
	
	
}

public void bothShft() throws SQLException{
	
	String sql = "select * from employee union all select * from WeekendShiftEmployees";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet result =ps.executeQuery();
	System.out.println("Employees from both Employees and WeekendShiftEmployees tables");
	while(result.next()) {
		String dep = result.getString("department");
		String name = result.getString("name");
		int id = result.getInt("ID");
		//String vcmp = result.getString("VehicleCmp");
		//int salary = result.getInt("Salary");
		System.out.println("Employee ID      :"+id+"\n"+
						   "Employee Name    :"+name+"\n"+
						   "Employee Department   :"+dep+"\n");
		System.out.println("--------------------------------------------------");
	}
	
	
	
}
	
public void topThree() throws SQLException{
	
	String sql = "select name ,id , department , salary from employee order by salary desc offset 0 rows fetch next 3 rows only;";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet result =ps.executeQuery();
	System.out.println("Top 3 Salary earning employees");
	while(result.next()) {
		String dep = result.getString("department");
		String name = result.getString("name");
		int id = result.getInt("ID");
		//String vcmp = result.getString("VehicleCmp");
		int salary = result.getInt("Salary");
		System.out.println("Employee ID      :"+id+"\n"+
						   "Employee Name    :"+name+"\n"+
						   "Employee Department   :"+dep+"\n"+
						   "Employee Salary   :"+salary+"\n");
		System.out.println("--------------------------------------------------");
	}
	
	
	
}

public void secondSal() throws SQLException{
	
	String sql = "select name ,id , department , salary from employee order by salary desc offset 1 rows fetch next 1 rows only;";
	
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet result =ps.executeQuery();
	System.out.println("Second highest Salary employee details");
	while(result.next()) {
		String dep = result.getString("department");
		String name = result.getString("name");
		int id = result.getInt("ID");
		//String vcmp = result.getString("VehicleCmp");
		int salary = result.getInt("Salary");
		System.out.println("Employee ID      :"+id+"\n"+
						   "Employee Name    :"+name+"\n"+
						   "Employee Department   :"+dep+"\n"+
						   "Employee Salary   :"+salary+"\n");
		System.out.println("--------------------------------------------------");
	}
	
	
	
}

}
