package inheritance;

class Order {
	int orderId;
	String orderDate;
	
	Order(int orderId, String orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	
	void getOrderStatus() {
		System.out.println("Order Details");
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Date: "+orderDate);
	}
}

class ShippedOrder extends Order{
	
	int trackingNumber;
	ShippedOrder(int orderId, String orderDate, int trackingNumber){
		super(orderId, orderDate);
		this.trackingNumber = trackingNumber;
	}
	@Override
	void getOrderStatus() {
		System.out.println("Order Details");
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Date: "+orderDate);
		System.out.println("Tracking Number: "+trackingNumber);
	}
}

class DeliveredOrder extends ShippedOrder{
	
	String deliveryDate;
	DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate){
		super(orderId, orderDate, trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	@Override
	void getOrderStatus() {
		System.out.println("Order Details");
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Date: "+orderDate);
		System.out.println("Tracking Number: "+trackingNumber);
		System.out.println("Delivery Date: "+deliveryDate);
	}
}

public class OnlineRetailOrderManagement {
	public static void main(String[] args) {
		Order order1 = new Order(123, "12-Jan-2026");
		ShippedOrder order2 = new ShippedOrder(124, "10-Jan-2026", 123456);
		DeliveredOrder order3 = new DeliveredOrder(125, "10-Jan-2026", 123457, "8-Jan-2026");
		order1.getOrderStatus();
		order2.getOrderStatus();
		order3.getOrderStatus();
	}

}
