package jdbc_assignment;

import java.sql.*;
import java.util.Scanner;

public class select_insert_duplicateDB {
	private static final String QUERY = "select * from emp_table";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jdbc_demo?useSSL=false";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public void selectFunc() {
		Connection con = null;

		try {
			con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			Statement statement = con.createStatement();
			ResultSet results = statement.executeQuery(QUERY);
			System.out.println("Employee table data");
			System.out.println("Id" + "\t" + "name" + "\t" + "city" + "\t" + "dept");
			while (results.next()) {
				int id = results.getInt("emp_id");
				String name = results.getString("emp_name");
				String city = results.getString("emp_city");
				String dept = results.getString("emp_dept");
				System.out.println(id + "\t" + name + "\t" + city + "\t" + dept);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void insertFunction() {
		Connection con = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("City: ");
		String city = sc.next();
		System.out.println("Dept: ");
		String dept = sc.next();

		String QUERY = "INSERT INTO emp_table  (emp_name, emp_city, emp_dept) VALUES ('" + name + "','" + city + "','"
				+ dept + "');";

		try {
			con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			Statement statement = con.createStatement();
			{
				int result = statement.executeUpdate(QUERY);
				System.out.println("No. of records affected: " + result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void removeDuplicate() {

		Connection con = null;

		String QUERY = "delete t1 from emp_table t1  join emp_table t2 where t1.emp_id < t2.emp_id AND t1.emp_name = t2.emp_name";

		try {
			con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			Statement statement = con.createStatement();
			{
				int result = statement.executeUpdate(QUERY);
				System.out.println("No. of  duplicate records deleted: " + result);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		select_insert_duplicateDB obj = new select_insert_duplicateDB();
		obj.selectFunc();
		// obj.insertFunction();
		// obj.selectFunc();
		obj.removeDuplicate();
		obj.selectFunc();
	}
}
