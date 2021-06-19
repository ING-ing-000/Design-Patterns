package FlyweightPattern;

public abstract class APiece {
	protected String inkind;
	public APiece(String inkind) {
		this.inkind=inkind;
	}
	public abstract void Play(int x,int y);

}
