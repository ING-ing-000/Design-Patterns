package VisitorPattern;


public class Client {

	public static void main(String[] args) {
		IProduct b1=new Book();
		IProduct b2=new Book();
		IProduct a1=new Apple();
		AVisitor visitor;
		
		BuyBasket basket=new BuyBasket();
		basket.addProduct(b1);
		basket.addProduct(b2);
		basket.addProduct(a1);
		
		visitor=(AVisitor)XMLUtilProduct.getBean();
		visitor.setName("张三");
		basket.accept(visitor);
	}
}
