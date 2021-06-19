package TemplateMethodPattern;

public class DefIntegalXX extends ADefiniteIntegral {

	private double a,b;
	private int c;
	public DefIntegalXX(double a,double b,int c) {
		this.a=a;this.b=b;this.c=c;
	}
	@Override
	protected double geta() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	protected double getb() {
		// TODO Auto-generated method stub
		return b;
	}

	@Override
	protected int getc() {
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	protected double function(double x) {
		// TODO Auto-generated method stub
		return x;
	}

}
