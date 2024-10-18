package model;

import java.util.ArrayList;
import java.util.List;

public class itemList {
	
	public List<itemBox> itemList = new ArrayList<itemBox>();
	
	public List<itemBox> getItemList(){
		return itemList;
	}
	public void setItemList(List<itemBox> itemList) {
		this.itemList = itemList;
	}
	public int getSize() {
		return itemList.size();
	}
}
