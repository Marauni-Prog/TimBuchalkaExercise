package abstractClasses;

public class OrderItem {
	private int quantity;
	private Product product;

	public OrderItem(int quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void getOrderList() {
		product.getPricedItems(quantity);
	}
	
	public double getOrderPrice() {
		return product.getSalesPrice(quantity);
	}
	
	

}
