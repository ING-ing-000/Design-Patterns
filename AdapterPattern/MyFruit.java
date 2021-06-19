package AdapterPattern;

public class MyFruit{
	protected String kind;
	MyFruit fruit;
	
	public void Set(MyFruit fruit) {
		this.fruit=fruit;
	}
	public String Get() {
		return fruit.kind;
	}
}