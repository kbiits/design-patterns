package strategy;

class Duck {
    protected IQuackStrategy quackStrategy;
    protected IFlyStrategy flyStrategy;

    public Duck() {
        this.flyStrategy = new SimpleFlyStrategy();
        this.quackStrategy = new SimpleQuackStrategy();
    }

    protected void fly() {
        this.flyStrategy.fly();
    }

    protected void quack() {
        this.quackStrategy.quack();
    }
}

class ComplexDuck extends Duck {

    public ComplexDuck() {
        this.flyStrategy = new ComplexFlyStrategy();
        this.quackStrategy = new ComplexQuackStrategy();
    }
}

class AnotherDuck extends Duck {

    public AnotherDuck() {
        this.flyStrategy = new SimpleFlyStrategy();
        this.quackStrategy = new ComplexQuackStrategy();
    }
}