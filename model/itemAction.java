package model;

public class itemAction {

	public itemAction() {
	}

	public String action(int item_num) {
		int[] Lv = main.D.getLv();
		String result = "";
		switch (item_num + 1) {
		case 1 -> {
			result = "�X�^�~�i�g���[�j���O���������ꂽ�I";

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
			result = "�ؗ̓g���[�j���O���������ꂽ�I";

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
			result = "�����g���[�j���O���������ꂽ�I";

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
			result = "�Z�p�g���[�j���O���������ꂽ�I";

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
			result = "�X�^�~�i�g���[�j���O����苭�����ꂽ�I";

			main.H.setStamina(main.H.getStamina() + 40);
			main.D.setLv(Lv[0] + 20, Lv[1], Lv[2], Lv[3]);
			main.ESC.setWC_NL(3);
			main.ESC.setWC_HD(3);
			if (main.H.getHungry() <= 0) {
				main.H.setHungry(0);
			} else {
				main.H.setHungry(main.H.getHungry() - 20);
			}
		}
		case 6 -> {
			result = "�ؗ̓g���[�j���O����苭�����ꂽ�I";

			main.H.setPower(main.H.getPower() + 40);
			main.D.setLv(Lv[0], Lv[1] + 20, Lv[2], Lv[3]);
			main.ESC.setWC_NL(3);
			main.ESC.setWC_HD(3);
			if (main.H.getHungry() <= 0) {
				main.H.setHungry(0);
			} else {
				main.H.setHungry(main.H.getHungry() - 20);
			}
		}
		case 7 -> {
			result = "�����g���[�j���O����苭�����ꂽ�I";

			main.H.setGuts(main.H.getGuts() + 40);
			main.D.setLv(Lv[0], Lv[1], Lv[2] + 20, Lv[3]);
			main.ESC.setWC_NL(3);
			main.ESC.setWC_HD(3);
			if (main.H.getHungry() <= 0) {
				main.H.setHungry(0);
			} else {
				main.H.setHungry(main.H.getHungry() - 20);
			}
		}
		case 8 -> {
			result = "�Z�p�g���[�j���O����苭�����ꂽ�I";

			main.H.setSkill(main.H.getSkill() + 40);
			main.D.setLv(Lv[0], Lv[1], Lv[2], Lv[3] + 20);
			main.ESC.setWC_NL(3);
			main.ESC.setWC_HD(3);
			if (main.H.getHungry() <= 0) {
				main.H.setHungry(0);
			} else {
				main.H.setHungry(main.H.getHungry() - 20);
			}
		}
		case 9 -> {
			result = "�S�Ẵg���[�j���O���������ꂽ�I�I";

			main.D.setLv(Lv[0] + 30, Lv[1] + 30, Lv[2] + 30, Lv[3] + 30);
			main.ESC.setWC_NL(20);
			main.ESC.setWC_HD(25);
			main.H.setStamina(main.H.getStamina() + 30);
			main.H.setPower(main.H.getPower() + 30);
			main.H.setGuts(main.H.getGuts() + 30);
			main.H.setSkill(main.H.getSkill() + 30);

		}
		case 10 -> {
			result = "���͂񂪎����ŏo�Ă���悤�ɂȂ����I";

			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			} else {
				main.H.setHungry(main.H.getHungry() + 15);
			}
			if (main.H.getWater() >= 100) {
				main.H.setWater(100);
			} else {
				main.H.setWater(main.H.getWater() + 15);
			}
			main.H.setAutoFlag(1);

		}
		case 11 -> {
			result = "�󕠃Q�[�W�������񕜂���";

			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			} else {
				main.H.setHungry(main.H.getHungry() + 20);
			}
			main.H.setLove(main.H.getLove() + 20);
		}
		case 12 -> {
			result = "�󕠃Q�[�W���񕜂���";

			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			} else {
				main.H.setHungry(main.H.getHungry() + 50);
			}
			main.H.setLove(main.H.getLove() + 50);
		}
		case 13 -> {
			result = "�̂ǂ�������";

			main.H.setWater(100);
			main.H.setLove(main.H.getLove() + 25);
		}
		case 14 -> {
			result = "�ؗ͂����āA���������������I";

			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			} else {
				main.H.setHungry(main.H.getHungry() + 20);
			}
			main.H.setPower(main.H.getPower() + 20);
			main.H.setLove(main.H.getLove() + 25);
		}
		case 15 -> {
			result = "�ł��I�����ŐH�ׂ�����";

			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			} else {
				main.H.setHungry(main.H.getHungry() + 20);
			}
			main.H.setGuts(main.H.getGuts() + 20);
			main.H.setLove(main.H.getLove() + 25);
		}
		case 16 -> {
			result = "������̉h�{���Ƃꂽ�I�C������";

			if (main.H.getHungry() >= 100) {
				main.H.setHungry(100);
			} else {
				main.H.setHungry(main.H.getHungry() + 50);
			}
			main.H.setStamina(main.H.getStamina() + 5);
			main.H.setPower(main.H.getPower() + 5);
			main.H.setGuts(main.H.getGuts() + 5);
			main.H.setSkill(main.H.getSkill() + 5);
			main.H.setLove(main.H.getLove() + 50);
		}
		case 17 -> {
			result = "�S�̒��̖쐶���ڊo�߂��E�E�E�悤�ȋC������";

			if (main.C.getHP() >= 100) {
				main.C.setHP(100);
			} else {
				main.C.setHP(main.C.getHP() + 50);
			}

		}
		case 18 -> {
			if (main.H == new zombie()) {
				result = "�n�����Y�����C�ɖ߂����@�悩�����`";
				main.H = new M_ham(main.H.getName(), main.H.getLove(), main.H.getHungry(), main.H.getClean(),
						main.H.getWater(), main.H.getStamina(), main.H.getPower(), main.H.getGuts(), main.H.getSkill(),
						0, main.H.getAP());
				if (main.H.getLove() <= 100) {
					main.H.setLove(100);
				}
			} else {
				result = "�]���r�ɂȂ��Ă��܂���I�I";
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
		return result;
	}
}
