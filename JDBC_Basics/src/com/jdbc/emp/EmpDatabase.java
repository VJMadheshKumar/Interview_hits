package com.jdbc.emp;

import java.sql.*;
import java.util.*;

public class EmpDatabase {
	
	
	private static Connection con = null;
	private static Scanner io = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDatabase emp = new EmpDatabase();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			final String url = "jdbc:mysql://localhost:3306/zohodb";//String connectionUrl = ";"  

			final String user = "root";
			final String password = "#Rogl2uyv";
			
			
			con = DriverManager.getConnection(url,user,password);
			
			boolean flag = true;
			while(flag) {
				
				
			System.out.println("Enter the choice given below");
			System.out.println("1:Insert element");
			System.out.println("2:Select record");
			System.out.println("3:Get records by range");
			System.out.println("4:Callable statement:All records by ID");
			System.out.println("5:Update records");
			System.out.println("6:Delete record");
			System.out.println("7:Manage transactions");
			System.out.println("8:Batch processing");
			System.out.println("9:Product List by id");
			System.out.println("10:Insert Product");
			System.out.println("11:Product List history");
			System.out.println("press 12 to quit");
			
			System.out.print("Your choice:");
			int choice = Integer.parseInt(io.nextLine());
			
			switch (choice) {
			case 1:
				emp.insert();
				break;
			case 2:
				emp.select();
				break;
			case 3:
				emp.allrecord();
				break;
			case 4:
				emp.getrecordbyid();
				break;
			case 5:
				emp.update();
				break;
			case 6:
				emp.delete();
				break;
			case 7:
				emp.manage();
				break;
			case 8:
				emp.batch();
				break;
			case 9:
				emp.product();
				break;
			case 10:
				emp.insproduct();
				break;
			case 11:
				emp.allproduct();
				break;
			default:
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
	
	private void insert() throws SQLException {
		//System.out.println("insert a record");
		
		String sql = "insert into emp( name, city, email) values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		//System.out.print("Enter ID number:");
		//ps.setInt(1,io.nextInt());
		//io.nextLine();
		
		System.out.print("Enter Email:");
		String email = io.nextLine();
		String check = "select * from emp where email = ?";
		//boolean flag = true;
		
		
		
		    PreparedStatement ps1 = con.prepareStatement(check);
			ps1.setString(1, email);
			ResultSet result =ps1.executeQuery();
			//CallableStatement cs =con.prepareCall("{ call GET_ALL() }");
			//ResultSet result = cs.executeQuery();
			
			
			
			if(result.next()) {
				//while(result.next()) {
				//int id = result.getInt("id");
				//String name = result.getString("name");
				//String city = result.getString("city");
				//String Email = result.getString("email");
				//System.out.println("Employee ID      :"+id+"\n"+
					//			   "Employee Name    :"+name+"\n"+
						//		   "Employee Address :"+city+"\n"+
							//	   "Employess Email  :"+Email+"\n");
				//}
				
				System.out.println("Data Already Exist");
			    /*System.out.println("Are you sure to insert the data y or n");
				System.out.print("Your choice:");
				String chk = io.nextLine();
				if(chk.equals("y")) {
					ps.setString(1,name);
					

					System.out.print("Enter Address:+++");
					ps.setString(2, io.nextLine());
					
					System.out.print("Enter Email address:");
					ps.setString(3, io.nextLine());
					
					int rows = ps.executeUpdate();
					
					if (rows>0) {
						System.out.println("record inserted"); 
						}*/
				
			}
		 
		else {
			
			ps.setString(3,email);
			
			System.out.print("Enter Email address:");
			ps.setString(2, io.nextLine());
			
			System.out.print("Enter Name:");
			ps.setString(1, io.nextLine());
			
			
			
			int rows = ps.executeUpdate();
			
			if (rows>0) {
				System.out.println("record inserted"); 
			}
		}
		
		
		
	}
	
	private void select() throws SQLException{
		System.out.print("Enter the ID number of the employee:");
		int condition = Integer.parseInt(io.nextLine());
		
		String sql = "select * from emp where id = ? ";
		 
		//Statement statement = con.createStatement();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, condition);
		ResultSet result =ps.executeQuery();
		
		if(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			String city = result.getString("city");
			String email = result.getString("email");
			System.out.println("Employee ID      :"+id+"\n"+
							   "Employee Name    :"+name+"\n"+
							   "Employee Address :"+city+"\n"+
							   "Employess Email  :"+email+"\n");
		}
		else {
			System.out.println("----Record not found-----");
		}
	}
	
	private void allrecord() throws SQLException{
		//System.out.println("working");
		System.out.print("Enter the starting range:");
		int from = Integer.parseInt(io.nextLine());
		
		System.out.print("Enter the ending range:");
		int to = Integer.parseInt(io.nextLine());
		
		
		String sql = "select * from emp where id between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, from);
		ps.setInt(2, to);
		ResultSet result =ps.executeQuery();
		//CallableStatement cs =con.prepareCall("{ call GET_ALL() }");
		//ResultSet result = cs.executeQuery();
		
		
		while(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			String city = result.getString("city");
			String email = result.getString("email");
			System.out.println("Employee ID      :"+id+"\n"+
							   "Employee Name    :"+name+"\n"+
							   "Employee Address :"+city+"\n"+
							   "Employess Email  :"+email+"\n");
			
		}
	}
	private void getrecordbyid() throws SQLException{
		//System.out.println("working");
		System.out.println("Enter the roll number to fetch the details");
		int roll = Integer.parseInt(io.nextLine());
		CallableStatement cs =con.prepareCall("{ call GET_RECORDS(?) }");
		cs.setInt(1, roll);
		ResultSet result = cs.executeQuery();
		
		
		while(result.next()) {
			int id = result.getInt("id");
			String name =  result.getString("name");
			String city =  result.getString("city");
			String email = result.getString("email");
			System.out.println("Employee ID      :"+id+"\n"+
							   "Employee Name    :"+name+"\n"+
							   "Employee Address :"+city+"\n"+
							   "Employess Email  :"+email+"\n");
			
		}
	}
	private void update() throws SQLException{
	//System.out.println("working");
	    System.out.print("Enter the ID number :");
	    int id = Integer.parseInt(io.nextLine());
		String sql = "select * from emp where id = ?";
		
		PreparedStatement ps0 = con.prepareStatement(sql);
		ps0.setInt(1, id);
		ResultSet result = ps0.executeQuery();
		
		if(result.next()) {
			int id_num = result.getInt("id");
			String name = result.getString("name");
			String city = result.getString("city");
			String email = result.getString("email");
			System.out.println("Employee ID      :"+id_num+"\n"+
							   "Employee Name    :"+name+"\n"+
							   "Employee Address :"+city+"\n"+
							   "Employess Email  :"+email+"\n");
			boolean flag2 = true;
			while(flag2) {
	        System.out.println("\n what do you need to update?");
	        System.out.println("1.ID");
	        System.out.println("2.Name");
	        System.out.println("3.City");
	        System.out.println("4.Email");
	        
	        int key = Integer.parseInt(io.nextLine());
	        
	        String sqlQ = "update emp set";
	        
	        switch(key) {
	        case 1:
	        	System.out.println("Enter the new ID to update:");
	        	int id_up= Integer.parseInt(io.nextLine());
	        	sqlQ+=" id = ? where id = ?";
	        	PreparedStatement ps= con.prepareStatement(sqlQ);
	        	ps.setInt(1, id_up);
	        	ps.setInt(2, id_num);
	        	int rows = ps.executeUpdate();
	        	if(rows>0) {
	        		System.out.println("Record updated successfully");
	        	}
	        	
	        	//System.out.println("working");
	        	break;
	        case 2:
	         	System.out.println("Enter the new Name to update :");
	        	String name_up= io.nextLine();
	        	sqlQ+=" name = ? where id = ?";
	        	PreparedStatement ps1= con.prepareStatement(sqlQ);
	        	ps1.setString(1, name_up);
	        	ps1.setInt(2, id_num);
	        	int rows1 = ps1.executeUpdate();
	        	if(rows1>0) {
	        		System.out.println("Record updated successfully");
	        	}
	        	
	        	//System.out.println("working");
	        	break;
	        case 3:
	        	//System.out.println("working");
	        	//break;
	        	System.out.println("Enter the new Address to update :");
	        	String add_up= io.nextLine();
	        	sqlQ+=" city = ? where id = ?";
	        	PreparedStatement ps2= con.prepareStatement(sqlQ);
	        	ps2.setString(1, add_up);
	        	ps2.setInt(2 ,id_num);
	        	int rows2 = ps2.executeUpdate();
	        	if(rows2>0) {
	        		System.out.println("Record updated successfully");
	        	}
	        	
	        	//System.out.println("working");
	        	break;
	        
	        case 4:
	        	System.out.println("Enter the new Mail to update :");
	        	String email_up= io.nextLine();
	        	sqlQ+=" email = ? where id = ?";
	        	PreparedStatement ps3= con.prepareStatement(sqlQ);
	        	ps3.setString(1, email_up);
	        	ps3.setInt(2 ,id_num);
	        	int rows3 = ps3.executeUpdate();
	        	if(rows3>0) {
	        		System.out.println("Record updated successfully");
	        	}
	        	
	        	//System.out.println("working");
	        	break;
	        
	          		
	        default:
	        	flag2=false;
	        	break;
	        }
	        
			}
		}
		else {
			System.out.println("----record not found----");
		}
	}
	private void delete() throws SQLException{
		//System.out.println("working");
		System.out.println("Enter the ID number to delete the data:");
	
		int del_id = Integer.parseInt(io.nextLine());
		String sql = "delete from emp where id = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,del_id);
		
		//Statement st = con.createStatement();
		int rows = ps.executeUpdate();
		
		if(rows>0) {
			System.out.println("Record deleted successfully");
		}
		
		
	
		
	}
	private void manage() throws SQLException{
		//System.out.println("working");
		con.setAutoCommit(false);
		
		String sql = "insert into emp(id, name, city, email) values(04, 'abilash','chennai', 'abilash@zohocorp.com')";
		String sql1 = "insert into emp(id, name, city, email) values(05, 'yakoob','chennai', 'yakoob@zohocorp.com')";
		
		PreparedStatement ps = con.prepareStatement(sql);
		int row =ps.executeUpdate();
		
		ps = con.prepareStatement(sql1);
		int row1 = ps.executeUpdate();
		
		if(row >0 && row1>0) {
			con.commit();
			System.out.println("transaction successfull");
		}
		else {
			con.rollback();
		}
	}
	private void batch() throws SQLException{
		con.setAutoCommit(false);
		
		String sql = "insert into emp(id, name, city, email) values(06, 'sarjeev','bangalore', 'sarjeev@zohocorp.com')";
		String sql1 = "insert into emp(id, name, city, email) values(07, 'harish','chennai', 'harish@zohocorp.com')";
		
		Statement st = con.createStatement();
		st.addBatch(sql);
		st.addBatch(sql1);
		
		
		int[] rows = st.executeBatch();
		
		for(int row : rows) {
			if(row > 0) {
				continue;
			}
			else {
				con.rollback();
			}
		}
		con.commit();
		System.out.println("batch successfull");
	}
	
	private void product() throws SQLException{
		//System.out.println("working");
			
		
			//boolean flag = true;
		    System.out.print("Enter the ID number :");
		    int id = Integer.parseInt(io.nextLine());
		    String sql = "select * from product inner join emp on product.id = emp.id  where product.id = ?";
			
			PreparedStatement ps0 = con.prepareStatement(sql);
			ps0.setInt(1, id);
			//ps0.setInt(2, id);
			ResultSet result = ps0.executeQuery();
			
			if(result.next()) {
			
			while(result.next()) {
				int id_num = result.getInt("id");
				String name = result.getString("name");
				String pid = result.getString("pid");
				String pname = result.getString("pname");
				System.out.println("Employee ID      :"+id_num+"\n"+
								   "Employee Name    :"+name+"\n"+
								   "Product ID       :"+pid+"\n"+
								   "Product Name     :"+pname+"\n");
			}
		}
			else {
				System.out.println("record not found");
			}
			
			
	}
	
	//insert into product (pname, id) values ('one plus 7',(select id from emp where id = 1));
	private void insproduct() throws SQLException{
		//System.out.println("working");
				

		   // String dlt = "delete t1 from productTemp t1 inner join productTemp t2 where t1.pid = t2.pid and t1.id < t2.id;";
			String sql = "insert into product (pname, id) values (?,(select id from emp where id = ?));";
			//String dlt = "delete s1 from productTemp as s1 inner join productTemp as s2 where s1.pid < s2.pid;";
			String cpy = "insert into productTemp (pid, pname, id) select pid, pname, id from product;";
            PreparedStatement ps0 = con.prepareStatement(sql);
            PreparedStatement ps1 = con.prepareStatement(cpy);
            //PreparedStatement ps2 = con.prepareStatement(dlt);
		
			//boolean flag = true;
		    System.out.print("Enter the ID number :");
		    int id = Integer.parseInt(io.nextLine());
		    System.out.print("Enter the product name :");
		    String productname = io.nextLine();
		    //ps2.executeUpdate();
			ps0.setString(1, productname);
			ps0.setInt(2, id);
			ps0.executeUpdate();
			//ps1.setInt(1, id);
			ps1.executeUpdate();
			
			
			String d  = "delete t1 from productTemp t1 inner join productTemp t2 where t1.sellerid < t2.sellerid and t1.pid = t2.pid;";
			PreparedStatement ps4 = con.prepareStatement(d);
	        ps4.executeUpdate();
			System.out.println("product inserted");
					
	}
	private void allproduct() throws SQLException{
		//System.out.println("working");
		String d  = "delete t1 from productTemp t1 inner join productTemp t2 where t1.sellerid < t2.sellerid and t1.pid = t2.pid;";
		PreparedStatement ps4 = con.prepareStatement(d);
        ps4.executeUpdate();
		
		
			String sql2 = "select * from ProductTemp";
			//String n  = "DELETE t1 FROM productTemp t1 INNER JOIN productTemp t2 ON t1.pid < t2.pid AND t1.id = t2.id;";
			
			 //PreparedStatement ps2 = con.prepareStatement(n);
			PreparedStatement ps1 = con.prepareStatement(sql2);
           
		
			//boolean flag = true;
		    //System.out.print("Enter the ID number :");
		    //int id = Integer.parseInt(io.nextLine());
		    //System.out.print("Enter the product name :");
		    //String productname = io.nextLine();
		    
			//ps0.setString(1, productname);
			//ps0.setInt(2, id);
            
            //ps0.executeUpdate();
            //ps2.executeUpdate();
            ResultSet result = ps1.executeQuery();
            
            System.out.println("Product ID   Product Name     Employee ID");
            while(result.next()) {
            	
            	int id = result.getInt("id");
            	String pname = result.getString("pname");
            	int pid = result.getInt("pid");
            	
            	System.out.println(pid+"\t"+pname+"\t\t"+id);	
            }
            						
	}
}
