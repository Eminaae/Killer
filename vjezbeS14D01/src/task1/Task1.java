package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded.");

			conn = DriverManager.getConnection("jdbc:sqlite:/Users/kristina.pupavac/Desktop/baza.db");
			System.out.println("Connection established.");
		} catch (SQLException e) {
			System.err.println("Could not connect to the database.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC library is not loaded.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	try {
			Statement statement = conn.createStatement();
//			String create ="CREATE TABLE employee(id integer primary key, name varchar(20), salary integer)";
//			statement.executeUpdate(create);
			
			ArrayList<Employee> list = new ArrayList<>();
			Employee e1 = new Employee(15, "Musa", 10000);
			Employee e2 = new Employee(16, "Emina", 5000);
			Employee e3 = new Employee(17, "Kristina", 5000);

			String c1 = "INSERT INTO employee VALUES(" + e1.getId() + ", '"
					+ e1.getName() + "', " + e1.getSalary() + ")";
			String c2 = "INSERT INTO employee VALUES(" + e2.getId() + ", '"
					+ e2.getName() + "', " + e2.getSalary() + ")";
			String c3 = "INSERT INTO employee VALUES(" + e3.getId() + ", '"
					+ e3.getName() + "', " + e3.getSalary() + ")";
			statement.executeUpdate(c1);
			statement.executeUpdate(c2);
			statement.executeUpdate(c3);
			list.add(e1);
			list.add(e2);
			list.add(e3);
			//System.out.println(list);
		} catch (SQLException e1) {
			System.err.println(e1.getMessage());
			System.err.println("Bad SQL Command.");
			System.err.println("Continuing on.");
		} 
		
		ArrayList<Employee> list = new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from employee");
		
			while (result.next()) {				
				int id = result.getInt(1);
				String name = result.getString(2);
				int salary = result.getInt(3);
				
				Employee e = new Employee(id, name, salary);
				list.add(e);
				System.out.println(list);
			}
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

}
