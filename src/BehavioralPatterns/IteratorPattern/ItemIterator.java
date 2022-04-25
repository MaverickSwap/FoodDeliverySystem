package BehavioralPatterns.iterator;


public interface ItemIterator<T>{
	public boolean hasNext();
	public T getNextItem();
	
}
