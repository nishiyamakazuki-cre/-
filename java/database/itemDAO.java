package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.itemBOX;
import model.main;

public class itemDAO {

	public itemDAO() {
	}

	public void loadItemData() {

		main.IL.itemList.clear();
		String SQL = "select * from itemData;";
		try (Connection conn = GetData.getConnection();
				PreparedStatement st = conn.prepareStatement(SQL)) {

			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				int item_num = rs.getInt("item_num");
				int item_val = rs.getInt("item_val");
				int amount = rs.getInt("amount");
				itemBOX IB = new itemBOX(name, item_num, item_val, amount);
				main.IL.itemList.add(IB);
			}

			System.out.println("itemData取得成功");

			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("itemData取得失敗");
		}

	}

	public void saveItemData() {

		String SQL;

		try (Connection conn = GetData.getConnection();
				Statement st = conn.createStatement()) {

			for (int i = 0; i < main.IL.getSize(); i++) {
				SQL = "UPDATE itemData SET amount = " + main.IL.itemList.get(i).getAmount() + " WHERE ID = " + i;
				st.executeUpdate(SQL);
			}

			System.out.println("itemData保存成功");
			st.close();
			conn.close();

		} catch (SQLException e) {
			System.err.println("itemData保存失敗");
		}

	}

	public void initialized() {

		String CTSQL = "CREATE TABLE itemData (" +
				"ID INTEGER, " +
				"name VARCHAR(50)," +
				"item_num INT," +
				"item_val INT," +
				"amount INT" +
				");";

		String[] INSQL = { "(1, \"回し車\", 0, 1000, 0)",
				",(2, \"ダンベル\", 1, 1200, 0)",
				",(3, \"タイヤ\", 2, 900, 0)",
				",(4, \"ヨガマット\", 3, 1000, 0)",
				",(5, \"縄跳び\", 4,1200, 0)",
				",(6, \"デッドリフト\", 5, 2000, 0)",
				",(7, \"けんすいマシーン\", 6, 2300, 0)",
				",(8, \"稽古用丸太\", 7, 3000, 0)",
				",(9, \"練習用ハムボット「D-800」\", 8, 30000, 0)",
				",(10, \"自動餌やり機「GHN-181」\", 9, 30000, 0)",
				",(11, \"ヒマワリの種\", 10, 200, 1)",
				",(12, \"ちんげん菜\", 11, 350, 0)",
				",(13, \"ハムスター用補水液\", 12, 350, 1)",
				",(14, \"ヒマワリの種 in Protein\", 13, 400, 0)",
				",(15, \"ハムスター用ジャーキー\", 14, 500, 0)",
				",(16, \"完全栄養ペレット\", 15, 2500, 0)",
				",(17, \"HAMSTER ENERGY\", 16, 210, 0)",
				",(18, \"ゾンビ治療薬\", 17, 8600, 0)" };

		String HEAD = "INSERT INTO itemData VALUES";
		String BODY = "";
		for (int i = 0; i < INSQL.length; i++) {
			BODY += INSQL[i];

		}
		String FOOT = ";";

		try (Connection conn = GetData.getConnection();
				Statement st = conn.createStatement()) {
			st.executeUpdate(CTSQL);
			PreparedStatement ps;
			ps = conn.prepareStatement(HEAD + BODY + FOOT);
			ps.executeUpdate();
			System.out.println("itemData初期化成功");

		} catch (SQLException e) {
			System.err.println("itemData初期化失敗");
		}

	}
}
