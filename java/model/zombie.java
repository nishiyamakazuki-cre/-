/**
*******************************************************************************
* クラス名　　：zombie
* プログラム名：ゾンビのクラス
* 処理概要　　：ゾンビのステータスの初期設定を行う。
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

public class zombie extends hamster {

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

	public zombie(String name, int love, int hungry, int clean, int water, int stamina, int power, int guts, int skill,
			int visual, int AP) {
		this.love = love;
		this.hungry = hungry;
		this.clean = clean;
		this.water = water;
		this.stamina = stamina;
		this.power = power;
		this.guts = guts;
		this.skill = skill;
		this.visual = visual;
		this.AP = AP;
	}

	public void setLove(int love) {
		this.love = love;
	}

	public void setHungry(int hungry) {
		this.hungry = hungry;
	}

	public void setClean(int clean) {
		this.clean = clean;
	}

	public void setWater(int water) {
		this.water = water;
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

	public void setVisual(int visual) {
		this.visual = visual;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAP(int AP) {
		this.AP = AP;
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

	public String getName() {
		return name;
	}

	public int getAP() {
		return AP;
	}

	public void setAutoFlag(int AutoFlag) {
		this.AutoFlag = AutoFlag;
	}

	public void AutoFlag() {
		if (AutoFlag == 1) {
			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			} else {
				main.H.setHungry(main.H.getHungry() + 5);
			}
			if (main.H.getWater() >= 100) {
				main.H.setWater(100);
			} else {
				main.H.setWater(main.H.getWater() + 5);
			}
		}
	}

	public String hungry() {
		int love;
		int AP = getAP();
		int hungry = getHungry();
		int recover = hungry + 25;
		String result = "";
		final int MAX_Hungry = 100;

		love = getLove();
		love += 20;
		if (recover >= MAX_Hungry) {
			hungry = MAX_Hungry;
		} else {
			hungry = recover;
		}

		AP -= 1;

		result = "満腹ゲージが回復しました";
		setLove(love);
		setHungry(hungry);
		setAP(AP);

		return result;
	}

	public String water() {

		int love;
		int AP = getAP();
		int water = getWater();
		int recover = water + 25;
		String result = "";
		final int MAX_Water = 100;

		love = getLove();
		love += 20;
		if (recover >= MAX_Water) {
			water = MAX_Water;
		} else {
			water = recover;
		}

		AP -= 1;

		result = "喉の渇きが潤いました";
		setLove(love);
		setWater(water);
		setAP(AP);

		return result;
	}

	public String clean() {
		int love = getLove();
		int AP = getAP();
		String result = "綺麗になりました";
		love += 50;
		AP -= 1;
		setLove(love);
		setClean(100);
		setAP(AP);

		return result;
	}

	public String touch() {
		int love;
		String result = "";
		int AP = getAP();

		love = getLove();
		love += 40;

		AP -= 1;

		result = "親愛度が増えました";
		setLove(love);
		setAP(AP);

		return result;
	}

	public zombie() {
	}
}