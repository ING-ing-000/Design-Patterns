package FactoryMethodPattern;

public class BFactory {
	public Fruit CreateFruit() {
		return new Banana();
	}

}
