package observer;

interface Observer<T> {
    public void update(T observable, Object stateThatChanged, Object oldState, Object newState);
}

class StudentObserver implements Observer<StudentObservable> {
    @Override
    public void update(StudentObservable observable, Object stateThatChanged, Object oldState, Object newState) {
        System.out.printf("Student %s changed from %s to %s\n", stateThatChanged, oldState, newState);
    }
}