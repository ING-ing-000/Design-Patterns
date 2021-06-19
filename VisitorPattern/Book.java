package VisitorPattern;

public class Book implements IProduct {

	public void accept(AVisitor visitor) {
		visitor.visit(this);

	}

}
