package model;

import java.util.ArrayList;
import java.util.List;

public class itemList {

	public List<itemBOX> itemList = new ArrayList<itemBOX>();

	public List<itemBOX> getItemList() {
		return itemList;
	}

	public void setItemList(List<itemBOX> itemList) {
		this.itemList = itemList;
	}

	public int getSize() {
		return itemList.size();
	}
	
}
