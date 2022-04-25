package BehavioralPatterns.IteratorPattern;

import java.util.List;

public class FoodList<T> {
	
	public List<T> items;
	
	public FoodList(List<T> items) {
		this.items = items;
	}
	
	
	public FoodIterator<T> iterator() {
		return new FoodIterator<T>(items);
	}
	
	
}