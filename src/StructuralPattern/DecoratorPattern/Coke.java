package StructuralPattern.DecoratorPattern;

public class Coke extends Extras {

    public Coke(OrderFood orderFood) {
        super(orderFood, 1.95f, " Coca Cola + ");
    }

    @Override
    public float cost() {
        return getPrice() + getFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFood().getDesc();
    }
}