package Day08_TF_1011;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoodsManager {

	static Map<Object, Object> goods = new HashMap<>();
	
	public void preGoods () {
		goods.put(1, new Goods(1, "라코스테 상의", 50000) );
		goods.put(2, new Goods(2, "나이키 트레이닝팬츠", 35000) );
		goods.put(3, new Goods(4, "아디다스 점퍼", 100000) );
	}
	
	public void goodsMenu () {
		while (true) {
			
			
		}
	}
}
