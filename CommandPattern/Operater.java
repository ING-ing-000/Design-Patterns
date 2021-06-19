package CommandPattern;

public class Operater {

	public void MarkFruit(Order order) {
		String str="";
		for(String key:order.getFruitmap().keySet()) {
			str+=key+order.getFruitmap().get(key).toString();
		}
		System.out.println("黑暗混合汁:"+str);
		
	}

}
