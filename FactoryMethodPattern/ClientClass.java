package FactoryMethodPattern;

public class ClientClass {
	public static void main(String[] args) {
//		Factory factory=new BFactory();
		//Fruit fruit=factory.CreateFruit();
		Factory factory=(Factory)XMLUtil.getBean();
		Fruit fruit=factory.CreateFruit();
		fruit.eat();
	}
}