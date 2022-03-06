package strategy;

interface IQuackStrategy {
    public void quack();
}

class SimpleQuackStrategy implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("ini simple quack");
    }
}

class ComplexQuackStrategy implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("ini kompleks quack");
    }
}