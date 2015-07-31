package lesson12.observable;


public interface Observable {
    void addObserver(Observer observer);
    void notifyObservers();
}
