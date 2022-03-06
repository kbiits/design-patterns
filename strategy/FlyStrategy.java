package strategy;

interface IFlyStrategy {
    public void fly();
}

class SimpleFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("ini simple fly");
    }
}

class ComplexFlyStrategy implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("ini kompleks fly");
    }
}