package ObserverPattern;


import java.util.Vector;

public class Topic implements Observable {
    Vector<Observer> observers;
    boolean changed = false;
    Object object;

    Topic() {
        observers = new Vector<>();
    }

    @Override
    public synchronized void addObserver(Observer observer) {
        if (observer == null) throw new NullPointerException("No observer");
        if (!observers.contains(observer)) {
            observers.addElement(observer);
        }
    }

    @Override
    public synchronized void removeObserver(Observer observer) {
        observers.removeElement(observer);
    }

    @Override
    public void notifyObservers() {
        Object[] localArray;
        synchronized (this) {
            if (!changed) return;
            localArray = observers.toArray();
            changed = false;
        }
        for (int i = 0; i < localArray.length; i++) {
            ((Observer) localArray[i]).update(this);
        }
    }

    @Override
    public Object getUpdate() {
        return this.object;
    }

    public void sendObject(Object object) {
        this.object = object;
        changed = true;
        notifyObservers();
    }
}
