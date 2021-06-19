package AdapterPattern;

public class Client {
	public static void main(String[] args) {
		MyFruit fruit1=new Apple();
		MyFruit fruit2=new Banana();
		
		Adapter ada=new Adapter();
		String str=ada.newPort(fruit1, fruit2);
		System.out.println(str);
		
	}

}
