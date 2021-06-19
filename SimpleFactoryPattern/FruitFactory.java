package SimpleFactoryPattern;

public class FruitFactory {
	public Fruit CreateFruit(String Kind) {
		if(Kind.equals("A"))
			return new Apple();
		if(Kind.equals("B"))
			return new Banana();
		return null;
	}

}
