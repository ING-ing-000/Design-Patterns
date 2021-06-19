package FacadePattern;
public class Light {
	String position;
	public Light(String position) {
		this.position=position;
	}

	public void on() {
		System.out.println(position+"灯光打开！");
	}
	public void off() {
		System.out.println(position+"灯光关闭！");
	}
}
