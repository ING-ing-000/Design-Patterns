package ObserverPattern;

import java.util.*;

public abstract class SubjectS {

	protected List<ObserverO> observers;
	public SubjectS() {
		observers=new ArrayList<ObserverO>();
	}
	public void Add(ObserverO observer) {
		observers.add(observer);
	}
	public void Remove(ObserverO observer) {
		observers.remove(observer);
	}
	public abstract void notifyObserver();
}
