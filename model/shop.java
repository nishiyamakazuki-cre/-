/**
*******************************************************************************
* クラス名　　：shop
* プログラム名：お買い物クラス
* 処理概要　　：アイテムを購入することができるクラス。
* メソッド名　：getItems	 getItems[] getItem_val  getItem_val buy_item
* 	パラメタ　：int:item_num void	  	int:item_num void		 int:item_num
* 	戻り値　　：String		 String[] 	int			 int[]		 String
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

public class shop {
	String msg;

	public shop() {
	}

	public String buy_item(int item_num) {

		if (item_num < 10) {
			if (main.IL.itemList.get(item_num).getItem_val() <= main.C.getMoney()) {
				if (main.IL.itemList.get(item_num).getAmount() == 0) {
					msg = main.IL.itemList.get(item_num).getName() + "を購入しました";
					main.IL.itemList.get(item_num).setAmount(1);
					main.C.setMoney(main.C.getMoney() - main.IL.itemList.get(item_num).getItem_val());
				} else {
					msg = "既に所有しています";
				}
			} else {
				msg = "お金が足りません！";
			}
		} else if (item_num >= 10) {
			if (main.IL.itemList.get(item_num).getItem_val() <= main.C.getMoney()) {
				msg = main.IL.itemList.get(item_num).getName() + "を購入しました";
				main.IL.itemList.get(item_num).setAmount(main.IL.itemList.get(item_num).getAmount() + 1);
				main.C.setMoney(main.C.getMoney() - main.IL.itemList.get(item_num).getItem_val());
			} else {
				msg = "お金が足りません！";
			}

		}

		return msg;
	}
}
