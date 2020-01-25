package com.cts.training.mysql;
import java.sql.*;
import java.util.Scanner;
public class Myapp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				// 1. Load driver in memory
				Class.forName("com.mysql.jdbc.Driver");

				// 2. Set up a connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root", "");

				// 3. Create a statement
				Statement stmt = conn.createStatement();
				Scanner sc=new Scanner(System.in);
				System.out.println("1.Show Record\n2.Add Record\n3.Delete Record");
				byte ch;
				ch= sc.nextByte();
				if(ch == 1 ||ch == 2 || ch == 3)
					switch(ch) {
					case 1: ResultSet rs =  stmt.executeQuery("select * from student;");
					while(rs.next()) {
						System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3)+" | "+rs.getInt(4));
					}
					rs.close(); 
					break;
					case 2: System.out.println("enter in the format of \nId Name Email and Phone");
							int id1 = sc.nextInt();
							String name =sc.next();
							String email=sc.next();
							int phone=sc.nextInt();
							int n =stmt.executeUpdate("insert into sample (Id,Name,Email,Phone)values('"+id1+"','"+name+"','"+email+"','"+phone+"');");
							System.out.println("No of rows Effected  : "+n);
					break;
					case 3: System.out.println("enter id to delte");
					int id =sc.nextInt();
					stmt.executeUpdate("delete from sample where Id =" +id);
					}
				
				conn.close();
				
				
			}
			catch(Exception ex) {
                   System.out.println(ex);
			}
		}
}

