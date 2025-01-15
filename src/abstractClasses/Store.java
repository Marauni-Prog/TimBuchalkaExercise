package abstractClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
	private List<Product> products;
	private List<OrderItem> order;

	public Store() {
		products = new ArrayList<>();
		order = new ArrayList<>();
	}

	public void addItem(Product... product) {
		products.addAll(Arrays.asList(product));
	}

	public void addOrder(OrderItem... item) {
		
		order.addAll(Arrays.asList(item));
	}

	public void process() {
		double totalPrice = 0.0;
		for (int i = 0; i < order.size(); i++) {
			order.get(i).getOrderList();
			totalPrice += order.get(i).getOrderPrice();
		}
		System.out.println("TOTAL ORDER ==" + totalPrice);
	}

	public void display() {
		for (int i = 0; i < products.size(); i++) {
			System.out.println("-".repeat(20));
			products.get(i).showDetails();
		}
	}
}
