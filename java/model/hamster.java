/**
*******************************************************************************
* クラス名　　：hamster
* プログラム名：ハムスターのスーパークラス
* 処理概要　　：ハムスターのステータスの初期設定を行う。
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

public abstract class hamster {

	private int love;
	private int hungry;
	private int clean;
	private int water;
	private int stamina;
	private int power;
	private int guts;
	private int skill;
	private int visual;
	private int AP;
	private int AutoFlag;
	private String name;
	private String result;
	private String[] rank;

	public hamster() {
	}

	public void setLove(int love) {
	}

	public void setHungry(int hungry) {
	}

	public void setClean(int clean) {
	}

	public void setWater(int water) {
	}

	public void setStamina(int stamina) {
	}

	public void setPower(int power) {
	}

	public void setGuts(int guts) {
	}

	public void setSkill(int skill) {
	}

	public void setVisual(int visual) {
	}

	public void setName(String name) {
	}

	public void setAP(int AP) {
	}

	public void setAutoFlag(int AutoFlag) {
		this.AutoFlag = AutoFlag;
	}

	public void AutoFlag() {

		if (AutoFlag == 1) {
			main.H.setHungry(main.H.getHungry() + 15);
			main.H.setWater(main.H.getWater() + 15);
			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			}
			if (main.H.getWater() >= 100) {
				main.H.setWater(100);
			}
		}
	}

	public int getLove() {
		return love;
	}

	public int getHungry() {
		return hungry;
	}

	public int getClean() {
		return clean;
	}

	public int getWater() {
		return water;
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

	public int getVisual() {
		return visual;
	}

	public int getAP() {
		return AP;
	}

	public String getName() {
		return name;
	}

	public String hungry() {
		return result;
	}

	public String water() {
		return result;
	}

	public String clean() {
		return result;
	}

	public String touch() {
		return result;
	}

	public String[] getStatusRank() {
		return rank;
	}

}
