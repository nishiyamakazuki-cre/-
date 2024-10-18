package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.E_ham;
import model.main;

public class EhamDAO {

	public EhamDAO() {
	}

	public void loadEhamData() {

		String sql = "select * from ehamdata;";
		try (Connection conn = GetData.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);) {

			ResultSet rs = st.executeQuery();
			int i = 0;

			while (rs.next()) {
				String name = rs.getString("name");
				int stamina = rs.getInt("stamina");
				int power = rs.getInt("power");
				int guts = rs.getInt("guts");
				int skill = rs.getInt("skill");
				switch (i) {
				case 0 -> {
					main.EH1 = new E_ham(name, stamina, power, guts, skill);
				}
				case 1 -> {
					main.EH2 = new E_ham(name, stamina, power, guts, skill);
				}
				case 2 -> {
					main.EH3 = new E_ham(name, stamina, power, guts, skill);
				}
				}
				i++;
			}

			System.out.println("EhamData取得成功");

			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("EhamData取得失敗");
		}

	}

	public void saveEhamData() {

		String sql1 = "UPDATE Ehamdata SET name=\"" + main.EH1.getName() +
				"\", stamina=\"" + main.EH1.getStamina() +
				"\", power=\"" + main.EH1.getPower() +
				"\", guts=\"" + main.EH1.getGuts() +
				"\", skill=\"" + main.EH1.getSkill() +
				"\" WHERE ID= 1;";
		String sql2 = "UPDATE Ehamdata SET name=\"" + main.EH2.getName() +
				"\", stamina=\"" + main.EH2.getStamina() +
				"\", power=\"" + main.EH2.getPower() +
				"\", guts=\"" + main.EH2.getGuts() +
				"\", skill=\"" + main.EH2.getSkill() +
				"\" WHERE ID= 2;";
		String sql3 = "UPDATE Ehamdata SET name=\"" + main.EH3.getName() +
				"\", stamina=\"" + main.EH3.getStamina() +
				"\", power=\"" + main.EH3.getPower() +
				"\", guts=\"" + main.EH3.getGuts() +
				"\", skill=\"" + main.EH3.getSkill() +
				"\" WHERE ID= 3;";

		try {
			Connection conn = GetData.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(sql1);
			st.executeUpdate(sql2);
			st.executeUpdate(sql3);
			System.out.println("EhamData保存成功");
			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("EhamData保存失敗");
		}

	}

	public void initialized() {

		String CTSQL = "CREATE TABLE Ehamdata (" +
				"ID INT," +
				"name VARCHAR(20)," +
				"stamina INT," +
				" power INT," +
				"guts INT," +
				" skill INT" +
				" );";
		String INSQL = "INSERT INTO EhamData VALUES (1, \"ハム青龍\", 15, 15, 15, 15)," +
				"(2, \"ハム鵬\", 25, 25, 25, 25)," +
				"(3, \"ハム道山\", 50, 50, 50, 50);";

		try (Connection conn = GetData.getConnection();) {

			Statement st = conn.createStatement();
			st.executeUpdate(CTSQL);
			PreparedStatement ps = conn.prepareStatement(INSQL);
			ps.executeUpdate();
			System.out.println("EhamData初期化成功");

		} catch (SQLException e) {
			System.err.println("EhamData初期化失敗");
		}
	}
}
