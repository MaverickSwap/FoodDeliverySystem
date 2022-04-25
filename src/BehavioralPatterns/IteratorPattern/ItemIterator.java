package BehavioralPatterns.IteratorPattern;


public interface ItemIterator<T>{
	public boolean hasNext();
	public T getNextItem();
	
}
