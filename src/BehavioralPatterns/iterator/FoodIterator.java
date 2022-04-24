package BehavioralPatterns.iterator;

import java.util.List;
import java.util.Locale.Category;


public class FoodIterator<T> implements ItemIterator {
	
	private int currentPos;
	private List<T> itemList;
	
	
	public FoodIterator( List<T> itemList ) {
		this.itemList = itemList;
		
	}


	@Override
	public boolean hasNext() {
		return currentPos < this.itemList.size();
	}


	@Override
	public T getNextItem() {
		return this.itemList.get(currentPos++);		
	}

}

