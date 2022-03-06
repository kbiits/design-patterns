package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new Duck());
        ducks.add(new ComplexDuck());
        ducks.add(new AnotherDuck());
        ducks.forEach(duck -> {
            duck.fly();
            duck.quack();
        });
    }
}
