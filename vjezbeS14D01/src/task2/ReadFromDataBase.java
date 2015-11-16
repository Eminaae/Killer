package task2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ReadFromDataBase {

	public static void main(String[] args) {
		ArrayList<Player> list = new ArrayList<>();
		try {
			Connection conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/kristina.pupavac/Desktop/player.db");
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery("select * from player");
			ResultSet max = statement.executeQuery("SELECT * FROM player WHERE grade = (SELECT MAX(grade) FROM player)");
			ResultSet nameLength = statement.executeQuery("SELECT * FROM player WHERE length(name) <= 8"); 
//			while (result.next()) {
//				int id = result.getInt(1);
//				String name = result.getString(2);
//				String grade = result.getString(3);
//
//				Player p = new Player(id, name, grade);
//				list.add(p);
//				System.out.println(list);
//			}
//			
//			while (max.next()) {
//				int id = max.getInt(1);
//				String name = max.getString(2);
//				String grade = max.getString(3);
//
//				Player p = new Player(id, name, grade);
//				list.add(p);
//				System.out.println(list);
//			}
			
			while (nameLength.next()) {
				int id = nameLength.getInt(1);
				String name = nameLength.getString(2);
				String grade = nameLength.getString(3);

				Player p = new Player(id, name, grade);
				list.add(p);
				System.out.println(list);
			}
			
			
			
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

}
