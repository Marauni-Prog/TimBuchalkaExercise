package groceryList;

import java.util.ArrayList;
import java.util.Comparator;

public class Grocery {
	private ArrayList<String> grocery = new ArrayList<>();

	public void addItem(String item) {
		String[] list = item.split("[,./]");
		for (int i = 0; i < list.length; i++) {
			if (!grocery.contains(list[i].toUpperCase())) {
				grocery.add(list[i].toUpperCase());
			}
		}
	}

	public void removeItem(String item) {
		String[] list = item.split("[,./]");
		for (int i = 0; i < list.length; i++) {
			if (grocery.contains(list[i].toUpperCase())) {
				grocery.remove(list[i].toUpperCase());
			}

		}
	}

	@Override
	public String toString() {
		grocery.sort(Comparator.naturalOrder());
		return "Grocery [" + grocery + "]";
	}

}
