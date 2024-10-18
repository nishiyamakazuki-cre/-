package model;

import java.util.Random;

public class Night {

	public String yoru() {
		int love = main.H.getLove();
		int AP = 3;
		main.H.setAP(AP);
		String result = "";
		Random rand = new Random();

		if (love <= 100) {
			if (main.H.getVisual() >= 3) {
				if (main.H != new zombie()) {
					result = "ゾンビになりました";
					main.H = new zombie(main.H.getName(), main.H.getLove(), main.H.getHungry(), main.H.getClean(),
							main.H.getWater(), main.H.getStamina(), main.H.getPower(), main.H.getGuts(),
							main.H.getSkill(), main.H.getVisual(), main.H.getAP());
					main.H.setVisual(0);
				} else {
					main.H.setVisual(0);
				}
			} else {
				main.H.setVisual(main.H.getVisual() + 1);
				result = "朝になりました";
			}
		} else if (love <= 25) {
			int ran = rand.nextInt(100);
			switch (ran) {
			case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50:
				result = "猫に連れ去られました";
				break;
			}
		} else if (love > 100) {
			main.H.setVisual(main.H.getVisual() - 1);
			result = "朝になりました";
		}
		return result;
	}
}
