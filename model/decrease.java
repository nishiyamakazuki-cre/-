package model;

public class decrease {
	public static void dec() {
		int decreaseHungry = main.H.getHungry();
		int decreaseClean = main.H.getClean();
		int decreaseWater = main.H.getWater();
		int love = main.H.getLove();
		int count = 0;
		int dec = 1;
		if(main.H == new zombie()) {
			dec = 2;
		}

		decreaseHungry -= 10;
		if (decreaseHungry <= 0) {
			decreaseHungry = 0;
		}
		decreaseClean -= 10;
		if (decreaseClean <= 0) {
			decreaseClean = 0;
		}
		decreaseWater -= 10;
		if (decreaseWater <= 0) {
			decreaseWater = 0;
		}

		if (decreaseHungry == 0) {
			count++;
		}
		if (decreaseClean == 0) {
			count++;
		}
		if (decreaseWater == 0) {
			count++;
		}
		switch (count) {
		case 1 -> {
			love -= 10 * dec;
		}
		case 2 -> {
			love -= 30 * dec;
		}
		case 3 -> {
			love -= 50 * dec;
		}
		}

		main.H.setHungry(decreaseHungry);
		main.H.setClean(decreaseClean);
		main.H.setWater(decreaseWater);
		main.H.setLove(love);
	}
}
