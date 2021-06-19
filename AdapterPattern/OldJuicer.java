package AdapterPattern;

public class OldJuicer {
	public String onePort(MyFruit fruit) {
		fruit.Set(fruit);
		String str=fruit.Get()+"水果";
		return str;
	}

}
