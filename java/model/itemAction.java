package model;

public class itemAction {

	public itemAction() {
	}

	public String action(int item_num) {
		int[] Lv = main.D.getLv();
		String result = "";

		if (main.IL.itemList.get(item_num).getAmount() == -1) {
			result = "既に使用しています！";
		} else if (main.IL.itemList.get(item_num).getAmount() == 0) {
			result = "アイテムを持っていません！";
		} else {
			switch (item_num + 1) {
			case 1 -> {
				result = "スタミナトレーニングが強化された！";

				main.H.setStamina(main.H.getStamina() + 20);
				main.D.setLv(Lv[0] + 10, Lv[1], Lv[2], Lv[3]);
				main.ESC.setWC_NL(1);
				main.ESC.setWC_HD(1);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 10);
				}
			}
			case 2 -> {
				result = "筋力トレーニングが強化された！";

				main.H.setPower(main.H.getPower() + 20);
				main.D.setLv(Lv[0], Lv[1] + 10, Lv[2], Lv[3]);
				main.ESC.setWC_NL(1);
				main.ESC.setWC_HD(1);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 10);
				}
			}
			case 3 -> {
				result = "根性トレーニングが強化された！";

				main.H.setGuts(main.H.getGuts() + 20);
				main.D.setLv(Lv[0], Lv[1], Lv[2] + 10, Lv[3]);
				main.ESC.setWC_NL(1);
				main.ESC.setWC_HD(1);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 10);
				}
			}
			case 4 -> {
				result = "技術トレーニングが強化された！";

				main.H.setSkill(main.H.getSkill() + 20);
				main.D.setLv(Lv[0], Lv[1], Lv[2], Lv[3] + 10);
				main.ESC.setWC_NL(1);
				main.ESC.setWC_HD(1);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 10);
				}
			}
			case 5 -> {
				result = "スタミナトレーニングがより強化された！";

				main.H.setStamina(main.H.getStamina() + 40);
				main.D.setLv(Lv[0] + 20, Lv[1], Lv[2], Lv[3]);
				main.ESC.setWC_NL(4);
				main.ESC.setWC_HD(4);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 20);
				}
			}
			case 6 -> {
				result = "筋力トレーニングがより強化された！";

				main.H.setPower(main.H.getPower() + 40);
				main.D.setLv(Lv[0], Lv[1] + 20, Lv[2], Lv[3]);
				main.ESC.setWC_NL(4);
				main.ESC.setWC_HD(4);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 20);
				}
			}
			case 7 -> {
				result = "根性トレーニングがより強化された！";

				main.H.setGuts(main.H.getGuts() + 40);
				main.D.setLv(Lv[0], Lv[1], Lv[2] + 20, Lv[3]);
				main.ESC.setWC_NL(4);
				main.ESC.setWC_HD(4);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 20);
				}
			}
			case 8 -> {
				result = "技術トレーニングがより強化された！";

				main.H.setSkill(main.H.getSkill() + 40);
				main.D.setLv(Lv[0], Lv[1], Lv[2], Lv[3] + 20);
				main.ESC.setWC_NL(4);
				main.ESC.setWC_HD(4);
				if (main.H.getHungry() <= 0) {
					main.H.setHungry(0);
				} else {
					main.H.setHungry(main.H.getHungry() - 20);
				}
			}
			case 9 -> {
				result = "全てのトレーニングが強化された！！";

				main.D.setLv(Lv[0] + 30, Lv[1] + 30, Lv[2] + 30, Lv[3] + 30);
				main.ESC.setWC_NL(20);
				main.ESC.setWC_HD(25);
				main.H.setStamina(main.H.getStamina() + 30);
				main.H.setPower(main.H.getPower() + 30);
				main.H.setGuts(main.H.getGuts() + 30);
				main.H.setSkill(main.H.getSkill() + 30);

			}
			case 10 -> {
				result = "ごはんが自動で出てくるようになった！";

				main.H.setHungry(main.H.getHungry() + 15);
				main.H.setWater(main.H.getWater() + 15);
				if (main.H.getHungry() >= 100) {
					main.H.setHungry(100);
				}
				if (main.H.getWater() >= 100) {
					main.H.setWater(100);
				}
				main.H.setAutoFlag(1);

			}
			case 11 -> {
				result = "空腹ゲージが少し回復した";

				main.H.setHungry(main.H.getHungry() + 50);
				if (main.H.getHungry() >= 100) {
					main.H.setHungry(100);
				}
				main.H.setLove(main.H.getLove() + 20);
			}
			case 12 -> {
				result = "空腹ゲージが回復した";

				main.H.setHungry(main.H.getHungry() + 70);
				if (main.H.getHungry() >= 100) {
					main.H.setHungry(100);
				}
				main.H.setLove(main.H.getLove() + 50);
			}
			case 13 -> {
				result = "のどを潤した";

				main.H.setWater(100);
				main.H.setLove(main.H.getLove() + 25);
			}
			case 14 -> {
				result = "筋力がついて、お腹も満たした！";

				main.H.setHungry(main.H.getHungry() + 20);
				if (main.H.getHungry() >= 100) {
					main.H.setHungry(100);
				}
				main.H.setPower(main.H.getPower() + 20);
				main.H.setLove(main.H.getLove() + 25);
			}
			case 15 -> {
				result = "固い！根性で食べきった";

				main.H.setHungry(main.H.getHungry() + 20);

				if (main.H.getHungry() >= 100) {
					main.H.setHungry(100);
				}
				main.H.setGuts(main.H.getGuts() + 20);
				main.H.setLove(main.H.getLove() + 25);
			}
			case 16 -> {
				result = "一日分の栄養がとれた！気がする";

				main.H.setHungry(main.H.getHungry() + 50);
				if (main.H.getHungry() >= 100) {
					main.H.setHungry(100);
				}
				main.H.setStamina(main.H.getStamina() + 5);
				main.H.setPower(main.H.getPower() + 5);
				main.H.setGuts(main.H.getGuts() + 5);
				main.H.setSkill(main.H.getSkill() + 5);
				main.H.setLove(main.H.getLove() + 50);
			}
			case 17 -> {
				result = "心の中の野生が目覚めた・・・ような気がする";

				main.C.setHP(main.C.getHP() + 50);
				if (main.C.getHP() >= 100) {
					main.C.setHP(100);
				}

			}
			case 18 -> {
				if (main.H != new M_ham()) {
					result = "ハム次郎が正気に戻った　よかった～";
					main.H = new M_ham(main.H.getName(), main.H.getLove(), main.H.getHungry(), main.H.getClean(),
							main.H.getWater(), main.H.getStamina(), main.H.getPower(), main.H.getGuts(),
							main.H.getSkill(),
							0, main.H.getAP());
					if (main.H.getLove() <= 100) {
						main.H.setLove(100);
					}
				} else if (main.H != new zombie()) {
					result = "ゾンビになっていません！！";
					main.IL.itemList.get(item_num).setAmount(main.IL.itemList.get(item_num).getAmount() + 1);
				}
			}
			case 19 -> {
			}
			case 20 -> {
			}
			}
			if (item_num < 10) {
				main.IL.itemList.get(item_num).setAmount(-1);
			} else if (item_num >= 10) {
				main.IL.itemList.get(item_num).setAmount(main.IL.itemList.get(item_num).getAmount() - 1);
			}
		}
		return result;
	}

}
