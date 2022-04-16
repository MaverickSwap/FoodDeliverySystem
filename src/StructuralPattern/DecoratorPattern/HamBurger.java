package StructuralPattern.DecoratorPattern;

public class HamBurger extends OrderFood {

    public HamBurger() {
        super(2.70f, " Ham Burger, with no onions ");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}