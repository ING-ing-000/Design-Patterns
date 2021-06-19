package ProxyPattern;

public class CTest implements ITestInterface{

	@Override
	public void sendMessage(String mes) {
		for(int i=5;i>=0;i--)
		{
			System.out.println(mes+"怪物的出现还有"+i+"秒");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(mes+"怪物出来了!");

		
		
	}

	
}
