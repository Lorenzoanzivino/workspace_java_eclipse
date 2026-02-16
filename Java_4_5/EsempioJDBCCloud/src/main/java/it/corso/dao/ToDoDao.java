package it.corso.dao;

import java.sql.*;
import java.util.ArrayList;

import it.corso.Database;
import it.corso.ToDo;
public class ToDoDao {

	public static boolean inserisciTask(String task) {
		String sql = "INSERT INTO Todolist(task) VALUES(?)";
		try {
			Connection conn = Database.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, task);
			return ps.executeUpdate() == 1;
		} catch (SQLException e) {
			System.err.println("Errore JDBC " + e.getMessage());
			throw new RuntimeException("Errore lettura todo", e);
		}
	}

	public static ArrayList<ToDo> findAll() {
		String sql = "SELECT * FROM todolist";
		ArrayList<ToDo> querylist = new ArrayList<>();
		try {
			Connection conn = Database.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String task = rs.getString("task");
				boolean done = rs.getBoolean("done");

				ToDo todo = new ToDo(id, task, done);
				querylist.add(todo);

			}
		} catch (SQLException e) {
			System.err.println("Errore JDBC " + e.getMessage());
			throw new RuntimeException("Errore inserimento todo", e);

		}
		return querylist;

	}
}
