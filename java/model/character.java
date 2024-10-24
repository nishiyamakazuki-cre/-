/**
*******************************************************************************
* クラス名　　：character
* プログラム名：主人公クラス
* 処理概要　　：主人公のステータスの初期化を行う。
* メソッド名　：character setHP	 setMoney  getHP  getMoney  setName		getName
* 	パラメタ　：void	  int:HP int:Money int:HP int:Money String:name String:name
* 	戻り値　　：void	  int	 int	   int    int		void	    String
*******************************************************************************
* 新規作成
*------------------------------------------------------------------------------
* バージョン　：1.0
* 作成日　　　：2024/09/26
* 作成者　　　：旭　海人
*******************************************************************************
* 変更履歴
*------------------------------------------------------------------------------
* 変更内容　　：
* 　　　　　　：
* バージョン　：
* 変更日　　　：YYYY/MM/DD
* 変更者　　　：
*******************************************************************************
*/

package model;

public class character {
	private String name;
	private int money;
	private int HP;

	public character(String name, int money, int HP) {
		this.name = name;
		this.money = money;
		this.HP = HP;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public int getHP() {
		return HP;
	}

	public String bathTime() {
		int HP = getHP();
		String result = "";
		int AP = main.H.getAP();
		int money = getMoney();
		if (money >= 200) {
			if (HP >= 50) {
				HP = 100;
			} else {
				HP += 50;
			}
			money -= 200;

			AP -= 1;
			setHP(HP);
			setMoney(money);
			main.H.setAP(AP);
			result = "お風呂に入りました";
		} else {
			result = "お金が足りません";
		}
		return result;
	}

	public String partTime() {
		int HP = getHP();
		String result = "";
		int AP = main.H.getAP();
		int money = getMoney();
		int getM = 0;
		if (HP <= 25) {
			getM = 1000;
		} else if (HP <= 75) {
			getM = 2000;
		} else if (HP <= 100) {
			getM = 3000;
		}

		HP -= 25;
		if (HP <= 0) {
			HP = 0;
		}
		AP -= 1;
		setHP(HP);
		setMoney(money + getM);
		main.H.setAP(AP);
		result = "お金を" + getM + " 円 稼ぎました";

		return result;
	}

}
