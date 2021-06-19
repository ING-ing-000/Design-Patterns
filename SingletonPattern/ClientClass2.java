package SingletonPattern;
//原型模式管理器
public class ClientClass2 {
	public static void main(String[] args) {
		MyFruit fru1=new Apple();
		MyFruit fru2=new Banana();
		MyFruitStore mfs1=MyFruitStore.Getfruitstore();
		mfs1.Add(1, fru1);
		mfs1.Add(2, fru2);
		mfs1.Add(3, new Apple());
		mfs1.Add(4, new Banana());
		MyFruitStore mfs2=MyFruitStore.Getfruitstore();
		MyFruit fru=(MyFruit)mfs1.Get(4);
		fru.Display();
		System.out.println("mfs1:"+mfs1.toString());
		System.out.println("mfs2:"+mfs2.toString());
	
	}

}
