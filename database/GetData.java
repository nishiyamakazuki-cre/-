package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {

	public GetData() {
	}

	private static final String DBNAME = "dosukoi";
	private static final String PROPATIES = "?characterEncoding=UTF-8&useSSL=false";
	private static final String DURL = "jdbc:mySQL://localhost:3306/" + DBNAME + PROPATIES;
	private static final String NURL = "jdbc:mySQL://localhost:3306/";
	private static final String USER = "root";
	private static final String PASS = "adminadmin";

	public void initialized() {

		try (Connection conn = getConnection();
				Statement st = conn.createStatement()) {
			String SQL = "DROP DATABASE dosukoi;";
			st.executeUpdate(SQL);
			System.out.println("データベース削除");
		} catch (SQLException e) {
			System.out.println("データベースなし");

		}

		try (Connection conn = DriverManager.getConnection(NURL, USER, PASS)) {
			Statement st = conn.createStatement();
			String SQL = "CREATE DATABASE " + DBNAME + ";";
			st.executeUpdate(SQL);
			System.out.println("データベース作成成功");
		} catch (SQLException e) {
			System.err.println("データベース作成失敗");

		}

		try (Connection conn = DriverManager.getConnection(DURL, USER, PASS)) {
			Statement st = conn.createStatement();
			String SQL = "USE " + DBNAME + ";";
			st.executeUpdate(SQL);
			System.out.println("データベース使用成功");
		} catch (SQLException e) {
			System.err.println("データベース使用失敗");

		}

	}

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DURL, USER, PASS);

		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("JDBC接続失敗");
		}
		return DriverManager.getConnection(DURL, USER, PASS);
	}

}