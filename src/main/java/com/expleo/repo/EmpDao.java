package com.expleo.repo;
import com.expleo.model.Emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDao implements Dao {


	@Override
	public Emp getEmp(int id) {
		Emp d2 = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expleo", "root", SqlPassword.pass)){
			Statement st = con.createStatement();
			String str = "Select * from emp where empno="+id;
			ResultSet rs = st.executeQuery(str);
			while(rs.next()) {
				int empno = rs.getInt(1);
				String name = rs.getString(2);
				float salary = rs.getFloat(3);
				Emp d1 = new Emp(empno, name, salary);
				d2=d1;
			}
			//System.out.println(rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d2;
	}


	@Override
	public int save(Emp e) {
		System.out.println("inside save method");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/expleo", "root", SqlPassword.pass)){
		
			Statement st = con.createStatement();
			ResultSet rs1 = st.executeQuery("select max(empno) from emp");
			rs1.next();
			int pkey = rs1.getInt(1);
			PreparedStatement pst = con.prepareStatement("Insert into emp values(?,?,?)");
			pst.setInt(1, ++pkey);
			pst.setString(2, e.getName());
			pst.setFloat(3,e.getSalary());
			int cnt = pst.executeUpdate();	
			
		}catch (SQLException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		}
		
		return 1;
	}
	
//	public static void main(String[] args) {
//		EmpDao obj = new EmpDao();
//		out.printf("\n %2d | %15s | %.2f",obj.getEmp(5).getEmpno(),obj.getEmp(5).getName(),obj.getEmp(5).getSalary());
//		//obj.save(new Emp(16, "Robin", 42000));
//		
//		//System.out.print(obj.getEmp(5).getName());
//		
//	}
}
