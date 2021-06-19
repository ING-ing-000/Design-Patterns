package ChainofResponsibilityPattern;

public class MidFruitSorting extends AbstractFruitSort {

	public MidFruitSorting(int weight) {
		super(weight);
	}

	@Override
	protected void pushBox(String fruit) {
		fruitBox.add("水果罐头："+fruit);

	}

}
