package PrototypePattern;
//原型模式管理器
public class ClientClass2 {
	public static void main(String[] args) {
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore.Add(1, fru1);
		MyFruitStore.Add(2, fru2);
		MyFruitStore.Add(3, new Apple());
		MyFruitStore.Add(4, new Banana());
		MyFruit fru=(MyFruit)MyFruitStore.Get(3);
		fru.Display();
	
	}

}
