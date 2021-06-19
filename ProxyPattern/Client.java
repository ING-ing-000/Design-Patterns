package ProxyPattern;

public class Client {
	public static void main(String[] args) {
		IShowPic isp=new CRemoPic(); 
		CLocalPicShow cpic=new CLocalPicShow(isp);
		IShowPic localpic=(IShowPic)cpic.getProxyInstance();
		localpic.ShowPic("AAA");
		
		
		ITestInterface it=new CTest();
		CLocalPicShow ct=new CLocalPicShow(it);
		ITestInterface localtest=(ITestInterface)ct.getProxyInstance();
		localtest.sendMessage("BBB");
	}
}
