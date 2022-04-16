package StructuralPattern.DecoratorPattern;

public class SubTotal extends payment {

    public SubTotal(OrderFood orderFood) {
        super(orderFood, 0.00f, " Sub Total = ");
    }

    @Override
    public float cost() {
        return getFood().cost();
    }
}