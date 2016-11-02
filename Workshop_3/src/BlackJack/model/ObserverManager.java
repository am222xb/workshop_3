package BlackJack.model;

public interface ObserverManager {
	void addObserver(Observer o);
	void notifyObservers();
	
}
