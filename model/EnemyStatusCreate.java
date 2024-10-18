package model;

import java.util.Random;

public class EnemyStatusCreate {

	private int EZ;
	private int NL;
	private int HD;
	private int WC_EZ = 0;
	private int WC_NL = 0;
	private int WC_HD = 0;

	public EnemyStatusCreate() {
	}

	public void setEnemyLevel(int EZ, int NL, int HD) {
		this.EZ = EZ;
		this.NL = NL;
		this.HD = HD;
	}

	public void setWC_EZ(int WC_EZ) {
		this.WC_EZ += WC_EZ;
	}

	public void setWC_NL(int WC_NL) {
		this.WC_NL += WC_NL;
	}

	public void setWC_HD(int WC_HD) {
		this.WC_HD += WC_HD;
	}

	public void WinCountLogic() {
		if (WC_EZ >= 10 && EZ < 3) {
			EZ++;
			WC_EZ = 0;
		}
		if (WC_NL > 20 && NL < 4) {
			NL++;
			WC_NL = 0;
		}
		if (WC_HD > 25 && HD < 5) {
			HD++;
			WC_HD = 0;
		}

	}

	public void enemyTraining() {
		int[] status = new int[4];

		status = trainingLogic(EZ);
		main.EH1 = setStatus(status, main.EH1);
		status = trainingLogic(NL);
		main.EH2 = setStatus(status, main.EH2);
		status = trainingLogic(HD);
		main.EH3 = setStatus(status, main.EH3);
	}

	public int[] trainingLogic(int level) {
		Random rnd = new Random();
		int[] status = new int[4];
		int exp = 0;
		switch (level) {
		case 1 -> {
			exp = 91;
			while (exp > 90 || 70 > exp) {
				exp = 0;
				for (int i = 0; i < 4; i++) {
					status[i] = rnd.nextInt(30);
					exp += status[i];
				}
			}
		}
		case 2 -> {
			exp = 111;
			while (exp > 110 || 90 > exp) {
				exp = 0;
				for (int i = 0; i < 4; i++) {
					status[i] = rnd.nextInt(40);
					exp += status[i];
				}
			}

		}
		case 3 -> {
			exp = 131;
			while (exp > 130 || 110 > exp) {
				exp = 0;
				for (int i = 0; i < 4; i++) {
					status[i] = rnd.nextInt(50);
					exp += status[i];
				}
			}
		}
		case 4 -> {
			exp = 161;
			while (exp > 160 || 130 > exp) {
				exp = 40;
				for (int i = 0; i < 4; i++) {
					status[i] = rnd.nextInt(60);
					exp += status[i];
				}
			}

		}
		case 5 -> {
			exp = 221;
			while (exp > 220 || 200 > exp) {
				exp = 40;
				for (int i = 0; i < 4; i++) {
					status[i] = rnd.nextInt(70);
					exp += status[i];
				}
			}

		}
		}
		return status;
	}

	public hamster setStatus(int[] status, hamster EH) {

		int stamina = EH.getStamina() + status[0];
		int power = EH.getPower() + status[1];
		int guts = EH.getGuts() + status[2];
		int skill = EH.getSkill() + status[3];
		EH.setStamina(stamina);
		EH.setPower(power);
		EH.setGuts(guts);
		EH.setSkill(skill);

		return EH;
	}
}
