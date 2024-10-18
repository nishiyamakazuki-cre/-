/**
*******************************************************************************
* クラス名　　：dosukoi
* プログラム名：相撲クラス
* 処理概要　　：相撲ステータスを計算して勝敗を決めるクラス
* メソッド名　：setM_status 		  setE_status statusLogic getWinLose
* 	パラメタ　：int:stamina int:skill int:stamina int:skill 
* 	パラメタ　：int:power int:guts    int:power int:guts
* 	戻り値　　：void				  void
* 
* メソッド名　：statusLogic getWinLose
* 	パラメタ　：void		void
* 	戻り値　　：void		String
*******************************************************************************
* 新規作成
*------------------------------------------------------------------------------
* バージョン　：1.0
* 作成日　　　：2024/09/27
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

import java.util.Random;

public class dosukoi {

	private int STAlv;
	private int POWlv;
	private int GUTlv;
	private int SKLlv;
	private int M_stamina;
	private int E_stamina;
	private int M_power;
	private int E_power;
	private int M_guts;
	private int E_guts;
	private int M_skill;
	private int E_skill;
	private int M_status;
	private int E_status;
	private String win;

	public dosukoi() {
	}

	public void setM_status(int stamina, int power, int guts, int skill) {
		this.M_stamina = stamina;
		this.M_power = power;
		this.M_guts = guts;
		this.M_skill = skill;
	}

	public void setE_status(int stamina, int power, int guts, int skill) {
		this.E_stamina = stamina;
		this.E_power = power;
		this.E_guts = guts;
		this.E_skill = skill;
	}

	public void statusLogic() {

		if (M_skill > E_power) {
			M_status += M_skill;
		} else if (E_skill > M_power) {
			E_status += E_skill;
		}

		if (M_guts > E_skill) {
			M_status += M_guts;
		} else if (E_guts > M_skill) {
			E_status += E_guts;
		}

		if (M_power > E_guts) {
			M_status += M_power;
		} else if (E_power > M_guts) {
			E_status += E_power;
		}

		M_status += M_stamina + M_power + M_guts + M_skill;
		E_status += E_stamina + E_power + E_guts + E_skill;

	}

	public String getWinLose() {
		if (M_status > E_status) {
			win = "1";
		} else if (M_status == E_status) {
			win = "2";
		} else {
			win = "0";
		}
		return win;
	}

	public String training(int i) {
		String msg = "";

		switch (i) {
		case 1://ちゃんこ
			train(3, 1, 2, 1);
			msg = "ちゃんこおいしい！";
			break;
		case 2://筋トレ
			train(2, 3, 1, 1);
			msg = "マッスルマッスル！";
			break;
		case 3://ダッシュ
			train(1, 1, 3, 2);
			msg = "夕日に向かってダッシュ！";
			break;
		case 4://瞑想
			train(1, 2, 1, 3);
			msg = "そうか...世界の心理とは...";
			break;
		}

		main.H.setAP(main.H.getAP() - 1);
		return msg;
	}

	public void winStatus(int plus) {
		Random rnd = new Random();
		int status = 0;
		int[] result = new int[4];
		int[] check = new int[4];
		int i = 0;
		while (i < 4) {
			status = rnd.nextInt(4);
			if (check[status] == 0) {
				result[status] = status;
				check[status] = 1;
				i++;
			}
		}
		for (i = 1; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (result[j] == i) {
					result[j] = plus;
					plus += 5;

					continue;
				}
			}
		}
		main.H.setStamina(main.H.getStamina() + result[0]);
		main.H.setPower(main.H.getPower() + result[1]);
		main.H.setGuts(main.H.getGuts() + result[2]);
		main.H.setSkill(main.H.getSkill() + result[3]);

	}

	public void setLv(int STAlv, int POWlv, int GUTlv, int SKLlv) {
		this.STAlv = STAlv;
		this.POWlv = POWlv;
		this.GUTlv = GUTlv;
		this.SKLlv = SKLlv;
	}

	public int[] getLv() {
		int[] Lv = { STAlv, POWlv, GUTlv, SKLlv };
		return Lv;
	}

	public void train(int a, int b, int c, int d) {
		Random rand = new Random();
		main.H.setStamina((int) (main.H.getStamina() + 10 + 10 * a * (1.0 - (rand.nextInt(30) / 100.0))) + STAlv);
		main.H.setPower((int) (main.H.getPower() + 10 + 10 * b * (1.0 - (rand.nextInt(30) / 100.0))) + POWlv);
		main.H.setGuts((int) (main.H.getGuts() + 10 + 10 * c * (1.0 - (rand.nextInt(30) / 100.0))) + GUTlv);
		main.H.setSkill((int) (main.H.getSkill() + 10 + 10 * d * (1.0 - (rand.nextInt(30) / 100.0))) + SKLlv);
	}
}
