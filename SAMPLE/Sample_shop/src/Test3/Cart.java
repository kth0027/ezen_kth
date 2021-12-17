package Test3;

public class Cart {

	private int lastCartNo = 0;
	// <cartno, Goods>
	private Map<Integer, Goods> mGoods = new HashMap<Integer, Goods>();
	// <Goods.code, cartno>
	private Map<Long, Integer> mCodeLink = new HashMap<Long, Integer>();

	public void Add(Goods g) {
		if (mCodeLink.containsKey(g.code)) {
			// throw new Exception("�̹� �����ϴ� ��ǰ�Դϴ�.");
		} else {
			lastCartNo++;
			mCodeLink.put(g.code, lastCartNo);
			mGoods.put(lastCartNo, g);
		}
	}

	public Goods getGoods(int cartno) {
		return mGoods.get(cartno);
	}

	public void DeleteGoods(long goodCode) {
		int cartno = mCodeLink.get(goodCode);
		mGoods.remove(cartno);
		mCodeLink.remove(goodCode);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("CartNo\t��ǰ�ڵ�\t��ǰ�� \t�ܰ�\t����\t�հ�\n");
		Iterator<Integer> iterator = mGoods.keySet().iterator();
		while (iterator.hasNext()) {
			Integer cartno = (Integer) iterator.next();
			Goods g = this.getGoods(cartno.intValue());
			sb.append(cartno + "\t" + g.toString() + "\n");
		}
		return sb.toString();
	}
}
