package AbstractFactoryPattern;

public class BConV implements BFruitAndVegetables {

	public Vegetables CreateV() {
		return new tomato();
	}
	public Fruit CreateF() {
		return null;
	}

}
