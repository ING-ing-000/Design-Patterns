package SimpleFactoryPattern;

public class ClientClass {
	public static void main(String[] args) {
		FruitFactory factory=new FruitFactory();
		Fruit fruit=factory.CreateFruit("A");
		fruit.eat();

	}

}
