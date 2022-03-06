package observer;

public class Main {
    public static void main(String[] args) {
        StudentObserver studentObserver = new StudentObserver();
        StudentObservable student = new StudentObservable();
        student.registerObserver(studentObserver);
        student.setName("Hai");
    }
}
