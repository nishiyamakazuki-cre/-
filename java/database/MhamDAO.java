package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.M_ham;
import model.main;
import model.zombie;

public class MhamDAO {

	public MhamDAO() {
	}

	public void loadMhamData() {

		String sql = "select * from mhamdata;";
		try (Connection conn = GetData.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);) {

			ResultSet rs = st.executeQuery();

			rs.next();
			String name = rs.getString("name");
			String[] MHD = { "love", "hungry", "clean", "water", "stamina", "power", "guts", "skill", "visual", "AP" };
			int[] M = new int[MHD.length];
			for (int i = 0; i < MHD.length; i++) {
				M[i] = rs.getInt(MHD[i]);
			}
			if (M[8] == 0) {
				main.H = new M_ham(name, M[0], M[1], M[2], M[3], M[4], M[5], M[6], M[7], M[8], M[9]);
			} else if (M[8] == 1) {
				main.H = new zombie(name, M[0], M[1], M[2], M[3], M[4], M[5], M[6], M[7], M[8], M[9]);
			}
			System.out.println("MhamData取得成功");

			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("MhamData取得失敗");
		}

	}

	public void saveMhamData() {

		String sql = "UPDATE Mhamdata SET name=\"" + main.H.getName() +
				"\", love=\"" + main.H.getLove() +
				"\", hungry=\"" + main.H.getHungry() +
				"\", clean=\"" + main.H.getClean() +
				"\", water=\"" + main.H.getWater() +
				"\", stamina=\"" + main.H.getStamina() +
				"\", power=\"" + main.H.getPower() +
				"\", guts=\"" + main.H.getGuts() +
				"\", skill=\"" + main.H.getSkill() +
				"\", visual=\"" + main.H.getVisual() +
				"\", AP=\"" + main.H.getAP() +
				"\" WHERE ID= 1;";

		try {
			Connection conn = GetData.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(sql);
			System.out.println("MhamData保存成功");
			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("MhamData保存失敗");
		}

	}

	public void initialized() {

		String CTSQL = "CREATE TABLE MhamData (" +
				"ID INT ," +
				"name VARCHAR(20), " +
				"love INT," +
				"hungry INT," +
				"clean INT," +
				"water INT," +
				"stamina INT," +
				"power INT," +
				"guts INT," +
				"skill INT," +
				"visual INT," +
				"AP INT" +
				");";

		String INSQL = "INSERT INTO MhamData VALUES ("
				+ "1, \"なのだ\", 50, 50, 100, 50, 10, 10, 10, 10, 0, 3 );";

		try (Connection conn = GetData.getConnection()) {

			Statement st = conn.createStatement();
			st.executeUpdate(CTSQL);
			PreparedStatement ps = conn.prepareStatement(INSQL);
			ps.executeUpdate();
			System.out.println("MhamData初期化成功");

		} catch (SQLException e) {
			System.err.println("MhamData初期化失敗");
		}
	}
}
