/**
*******************************************************************************
* クラス名　　：E_ham
* プログラム名：敵ハムスターのクラス
* 処理概要　　：敵ハムスターのステータスの初期設定を行う。
* メソッド名　：setLove	 setHungry  setClean  setWater	setStamina  setPower
* 	パラメタ　：int:love int:hungry int:clean int:water int:stamina int:power
* 	戻り値　　：int		 int		int	      int		int		    int
* 
* メソッド名　：setGuts  setSkill  setVisual  hamster getLove  getHungry
* 	パラメタ　：int:guts int:skill int:visual void	  int:love int:hungry 
* 	戻り値　　：int		 int	   int	      void 	  int	   int		  
*
* メソッド名　：getClean  getWater  getStamina  getPower  setGuts  getSkill
* 	パラメタ　：int:clean int:water int:stamina int:power int:guts int:skill
* 	戻り値　　：int		  int		int		    int	      int	   int
* 
* メソッド名　：getVisual  setName	   getName
* 	パラメタ　：int:visual String:name String:name
* 	戻り値　　：int		   void		   String
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

public class E_ham extends hamster {
	private String name;
	private int stamina;
	private int power;
	private int guts;
	private int skill;
	private String[] rank = new String[4];

	public E_ham(String name, int stamina, int power, int guts, int skill) {
		this.name = name;
		this.stamina = stamina;
		this.power = power;
		this.guts = guts;
		this.skill = skill;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public void setGuts(int guts) {
		this.guts = guts;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStamina() {
		return stamina;
	}

	public int getPower() {
		return power;
	}

	public int getGuts() {
		return guts;
	}

	public int getSkill() {
		return skill;
	}

	public String getName() {
		return name;
	}

	public String[] getStatusRank() {
		int[] getRank = { getStamina(), getPower(), getGuts(), getSkill() };
		int[] getHRank = { main.H.getStamina(), main.H.getPower(), main.H.getGuts(), main.H.getSkill() };
		for (int i = 0; i < 4; i++) {
			if (getRank[i] - getHRank[i] >= 50) {
				rank[i] = "つよすぎ";
			} else if (getRank[i] - getHRank[i] <= 50 && getRank[i] - getHRank[i] >= 15) {
				rank[i] = "つよいかも";
			} else if ((getHRank[i] > getRank[i] && getHRank[i] - getRank[i] <= 15)
					|| (getRank[i] > getHRank[i] && getRank[i] - getHRank[i] <= 15)) {
				rank[i] = "どっこい";
			} else if (getHRank[i] - getRank[i] <= 50 && getHRank[i] - getRank[i] >= 15) {
				rank[i] = "いけるかも";
			} else if (getHRank[i] - getRank[i] >= 50) {
				rank[i] = "よゆ～";
			}
		}
		return rank;
	}
}
