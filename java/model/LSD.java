package model;

public class LSD {
	public LSD() {
	}

	public void initialized() {
		main.GD.initialized();
		main.CD.initialized();
		main.CD.loadCharData();
		main.MD.initialized();
		main.MD.loadMhamData();
		main.ED.initialized();
		main.ED.loadEhamData();
		main.ID.initialized();
		main.ID.loadItemData();
		main.ESC.setEnemyLevel(1, 2, 3);
		main.ESC.enemyTraining();
	}

	public void saving() {
		main.CD.saveCharData();
		main.MD.saveMhamData();
		main.ED.saveEhamData();
		main.ID.saveItemData();
	}

	public void loading() {
		main.CD.loadCharData();
		main.MD.loadMhamData();
		main.ED.loadEhamData();
		main.ID.loadItemData();
	}
}
