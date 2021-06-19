package ChainofResponsibilityPattern;

public class SmallFruitSorting extends AbstractFruitSort {

	public SmallFruitSorting(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void pushBox(String fruit) {
		fruitBox.add("打果汁："+fruit);

	}

}
