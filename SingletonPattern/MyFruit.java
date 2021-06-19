package SingletonPattern;

public class MyFruit implements Cloneable {
	protected String kind;
	public void Display() {
		System.out.println(kind);
	}
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

}

