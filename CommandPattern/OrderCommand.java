package CommandPattern;

public class OrderCommand implements Command {

	private Operater receiver;
	private Order order;
	public OrderCommand(Operater receiver,Order order) {
		this.receiver=receiver;
		this.order=order;
	}

	@Override
	public void execute() {
		System.out.println(order.getId()+"号顾客的成品");
		receiver.MarkFruit(order);
		
	}

}
