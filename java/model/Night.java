package model;

import java.util.Random;

public class Night {

	public String yoru() {
		int love = main.H.getLove();
		int AP = 3;
		main.H.setAP(AP);
		String result = "";
		Random rand = new Random();

		if (love <= 25) {
			int ran = rand.nextInt(100);
			switch (ran) {
			case 1, 3, 10, 11, 19, 20, 21, 22, 31, 33, 34, 37, 38, 46, 49, 54, 62, 64, 66, 67, 78, 79, 80, 81, 86, 91, 95, 97, 99, 100 -> {
				result = "猫に連れ去られました";
			}
			default -> {
				main.H.setVisual(main.H.getVisual() + 1);
				result = "朝になりました";
			}
			}
		} else if (love <= 100) {
			main.H.setVisual(main.H.getVisual() + 1);
			result = "朝になりました";
		} else if (love > 100) {
			main.H.setVisual(main.H.getVisual() - 1);
			result = "朝になりました";
		}
		if (main.H == new zombie()) {
			main.H.setVisual(1);
		}
		if (main.H.getVisual() >= 3) {
			if (main.H != new zombie()) {
				result = "ゾンビになりました";
				main.H = new zombie(main.H.getName(), main.H.getLove(), main.H.getHungry(), main.H.getClean(),
						main.H.getWater(), main.H.getStamina(), main.H.getPower(), main.H.getGuts(),
						main.H.getSkill(), main.H.getVisual(), main.H.getAP());
				main.H.setVisual(1);
			} else {
				main.H.setVisual(1);
			}
		}
		System.out.println(main.H.getVisual());
		return result;
	}
}
