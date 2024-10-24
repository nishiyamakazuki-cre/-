package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.character;
import model.main;

public class charDAO {

	public charDAO() {
	}

	public void loadCharData() {

		String sql = "select * from chardata;";
		try (Connection conn = GetData.getConnection();
				PreparedStatement st = conn.prepareStatement(sql)) {

			ResultSet rs = st.executeQuery();

			rs.next();

			String name = rs.getString("name");
			int money = rs.getInt("money");
			int HP = rs.getInt("HP");
			main.C = new character(name, money, HP);
			System.out.println("charData取得成功");

			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("charData取得失敗");
		}

	}

	public void saveCharData() {

		String sql = "UPDATE chardata SET name=\"" + main.C.getName() + "\", money=\"" + main.C.getMoney() + "\", HP=\""
				+ main.C.getHP() + "\" WHERE ID= 1";

		try (Connection conn = GetData.getConnection();
				Statement st = conn.createStatement()) {

			st.executeUpdate(sql);
			System.out.println("charData保存成功");
			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("charData保存失敗");
		}

	}

	public void initialized() {
		
		String CTSQL = "CREATE TABLE chardata (" +
				"ID INT," +
				"name VARCHAR(20), " +
				"money INT, " +
				"HP INT" +
				");";
		String INSQL = "INSERT INTO chardata VALUES(1, \"\", 5000, 100);";

		try (Connection conn = GetData.getConnection()) {

			Statement st = conn.createStatement();
			st.executeUpdate(CTSQL);
			PreparedStatement ps = conn.prepareStatement(INSQL);
			ps.executeUpdate();
			System.out.println("charData初期化成功");

		} catch (SQLException e) {
			System.err.println("charData初期化失敗");
		}
	}

}
