package observer;

import java.util.ArrayList;
import java.util.List;

interface Observable<T> {
    public void registerObserver(Observer<T> observer);

    public void removeObserver(Observer<T> observer);

    public void notifyObservers(Object stateThatChanged, Object oldStatee, Object newState);
}

class StudentObservable implements Observable<StudentObservable> {
    List<Observer<StudentObservable>> lObservers;

    private String name;

    public StudentObservable() {
        this.lObservers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.notifyObservers("name", this.name, name);
        this.name = name;
    }

    @Override
    public void registerObserver(Observer<StudentObservable> observer) {
        this.lObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer<StudentObservable> observer) {
        this.lObservers.removeIf(o -> o == observer);
    }

    @Override
    public void notifyObservers(Object stateThatChanged, Object oldState, Object newState) {
        this.lObservers.forEach(o -> {
            o.update(this, stateThatChanged, oldState, newState);
        });
    }

}
