package task4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Reading {
	public static ArrayList<Team> list = new ArrayList<>();

	public static void main(String[] args) {

		try {
			Connection conn = DriverManager
					.getConnection("jdbc:sqlite:/Users/kristina.pupavac/Desktop/standings.db");
			Statement statement = conn.createStatement();
			// ResultSet result = statement.executeQuery("select * from team");
			// ResultSet result =
			// statement.executeQuery("select * from team order by points");
			ResultSet result = statement
					.executeQuery("select * from team order by fromgroup, points");
			while (result.next()) {
				int id = result.getInt(1);
				String name = result.getString(2);
				Integer wins = result.getInt(3);
				Integer losses = result.getInt(4);
				Integer points = result.getInt(5);
				Integer scoredplus = result.getInt(6);
				Integer scoredminus = result.getInt(7);
				String fromgroup = result.getString(8);

				Team t = new Team(id, name, wins, losses, points, scoredplus,
						scoredminus, fromgroup);
				list.add(t);

			}
			//System.out.println(list);
			System.out.println(groupTeam("A"));
		} catch (SQLException e) {
			System.err.println("Bad SQL command.");
			System.err.println("Msg: " + e.getMessage());
			System.exit(1);
		}

	}

	public static ArrayList<Team> groupTeam(String groupName) {
		ArrayList<Team> team = new ArrayList<Team>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getFromgroup().equals(groupName)) {
				team.add(list.get(i));
			}
		}
		return team;
	}
}
