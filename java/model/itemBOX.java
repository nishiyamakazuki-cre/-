/**
*******************************************************************************
* クラス名　　：character
* プログラム名：主人公クラス
* 処理概要　　：主人公のステータスの初期化を行う。
* メソッド名　：itemBox use_item 	  action 		getItemaster setItemaster
* 	パラメタ　：void	int:item_num  int:item_num  void		 int:item_num int:amount
* 	戻り値　　：void	String		  String   	    int[]		 void
*******************************************************************************
* 新規作成
*------------------------------------------------------------------------------
* バージョン　：1.0
* 作成日　　　：2024/09/26
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

import java.util.List;

public class itemBOX {

	private int item_num;
	private int[] itemaster = new int[4];
	private String name;
	private int amount;
	private int item_val;
	List<itemBOX> itemList = main.IL.getItemList();

	public itemBOX(String name, int item_num, int item_val, int amount) {
		this.name = name;
		this.item_num = item_num;
		this.item_val = item_val;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getItem_num() {
		return item_num;
	}

	public int getItem_val() {
		return item_val;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getItemaster(int item_num) {
		return itemaster[item_num];
	}

	public void setItemaster(int item_num, int amount) {
		itemaster[item_num] = amount;
	}

}
