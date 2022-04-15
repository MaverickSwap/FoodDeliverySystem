package StructuralPattern.DecoratorPattern;

public class CheeseBurger extends OrderFood {

public CheeseBurger() {

super(3.00f, " Cheese Burger, with no onions");
}
@Override
public float cost() {

return getPrice(); 
}
}