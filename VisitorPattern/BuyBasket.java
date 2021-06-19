package VisitorPattern;

import java.util.*;

public class BuyBasket {

	private ArrayList list=new ArrayList();
	public void accept(AVisitor visitor) {
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			((IProduct)i.next()).accept(visitor);
		}
	}
	public void addProduct(IProduct product)
	{
		list.add(product);
	}
	public void removeProduct(IProduct product) {
		list.remove(product);
	}
}
