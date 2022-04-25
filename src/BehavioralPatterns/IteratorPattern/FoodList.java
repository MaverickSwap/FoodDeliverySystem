package BehavioralPatterns.iterator;

import java.util.List;

public class FoodList<T> implements FoodListIterator {
	
	public List<T> items;
	
	public FoodList(List<T> items) {
		this.items = items;
	}
	
	
	public FoodIterator<T> iterator() {
		return new FoodIterator<T>(items);
	}
	
	
}

