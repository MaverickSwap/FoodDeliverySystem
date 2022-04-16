package StructuralPattern.DecoratorPattern;

public class Onion extends Extras {

    public Onion(OrderFood orderFood) {
        super(orderFood, 0.00f, " Onion + ");
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