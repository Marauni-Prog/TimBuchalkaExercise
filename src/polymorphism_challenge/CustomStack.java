package polymorphism_challenge;

import java.util.ArrayList;
import java.util.List;
//  this is a custom, stack Class  Daniel Liang book page 464

public class CustomStack {
	private List<Object> list = new ArrayList<>();

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int getSize() {
		return list.size();
	}

	public Object peek() {
		if (!list.isEmpty()) {
			return list.get(0);
		}
		return null;
	}

	public Object pop() {
		if(!list.isEmpty()) {
			var o = list.get(list.size()-1);
			list.remove(list.size()-1);
			return o;
		}
		return null;
	}
	
	public void push(Object o) {
		list.add(o);
	}

	@Override
	public String toString() {
		return "CustomStack [list=" + list.toString() + "]";
	}
	
	
}
