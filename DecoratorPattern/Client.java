package DecoratorPattern;
public class Client {
	public static void main(String[] args) {
		IBirthdayCake birthdaycake=new Cake();
		birthdaycake.Show();
		
		Cream cream=new Cream(birthdaycake);
		cream.PutCream();
		
		Fruit fruit=new Fruit(cream);
		fruit.PutFruit();
		fruit.Show();
	}
}
