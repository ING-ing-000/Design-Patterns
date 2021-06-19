package SingletonPattern;

import java.util.Hashtable;
//懒汉式
public class MyFruitStore {
	private static Hashtable fruittable=null;
	private static MyFruitStore fruitstore=null;
	private MyFruitStore() {
		fruittable=new Hashtable<Integer,MyFruit>();
	}
	public static MyFruitStore Getfruitstore() {
		if(fruitstore==null) {
			fruitstore=new MyFruitStore();
		}
		return fruitstore;
	}
	public static void Add(Integer key,MyFruit fruit) {
		fruittable.put(key, fruit);
	}
	public static MyFruit Get(Integer key) {
		MyFruit fruit=(MyFruit)fruittable.get(key);
		return (MyFruit)fruit.clone();
	}
	
}
////饿汉式
//public class MyFruitStore {
//	private static Hashtable fruittable=null;
//	private static MyFruitStore fruitstore=new MyFruitStore();
//	private MyFruitStore() {
//		fruittable=new Hashtable<Integer,MyFruit>();
//	}
//	public static MyFruitStore Getfruitstore() {
//		
//		return fruitstore;
//	}
//	public static void Add(Integer key,MyFruit fruit) {
//		fruittable.put(key, fruit);
//	}
//	public static MyFruit Get(Integer key) {
//		MyFruit fruit=(MyFruit)fruittable.get(key);
//		return (MyFruit)fruit.clone();
//	}
//}

