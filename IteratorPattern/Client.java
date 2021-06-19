package IteratorPattern;

public class Client {

	public static void display(Television tv) {
		TVIterator i=tv.createIterator();
		System.out.println("电视机频道：");
		while(!i.isLast())
		{
			System.out.println(i.currentChannel());
			i.next();
		}
	}
	public static void main(String[] args) {
		Client cl=new Client();
		Television tv=new TCLTelevision();
		cl.display(tv);
	}
}
