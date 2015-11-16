package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Task2 {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println("Library loaded.");

			conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/kristina.pupavac/Desktop/player.db");
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
//			String create = "CREATE TABLE player(id integer primary key, name varchar(20), grade varchar(10))";
//			statement.executeUpdate(create);

			ArrayList<Player> list = new ArrayList<>();
			Player e1 = new Player(1, "Njegos S.", "B");
			Player e2 = new Player(2, "Dzanan M.", "A");
			Player e3 = new Player(3, "Sani C.", "B");
			Player e4 = new Player(4, "Timur O.", "C");

			String c1 = "INSERT INTO player VALUES(" + e1.getId() + ", '"
					+ e1.getName() + "', '" + e1.getGrade() + "')";
			String c2 = "INSERT INTO player VALUES(" + e2.getId() + ", '"
					+ e2.getName() + "', '" + e2.getGrade() + "')";
			String c3 = "INSERT INTO player VALUES(" + e3.getId() + ", '"
					+ e3.getName() + "', '" + e3.getGrade() + "')";
			String c4 = "INSERT INTO player VALUES(" + e4.getId() + ", '"
					+ e4.getName() + "', '" + e4.getGrade() + "')";
			statement.executeUpdate(c1);
			statement.executeUpdate(c2);
			statement.executeUpdate(c3);
			statement.executeUpdate(c4);
			list.add(e1);
			list.add(e2);
			list.add(e3);
			list.add(e4);
			// System.out.println(list);
		} catch (SQLException e1) {
			System.err.println(e1.getMessage());
			System.err.println("Bad SQL Command.");
			System.err.println("Continuing on.");
		}

	}

}
