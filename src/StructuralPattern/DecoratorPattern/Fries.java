package StructuralPattern.DecoratorPattern;

public class Fries extends Extras {

public Fries(OrderFood orderFood) {

super(orderFood, 1.95f, " French Fries + ");
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