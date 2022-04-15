package StructuralPattern.DecoratorPattern;

public class ThousandIslandSauce extends Extras {

public ThousandIslandSauce(OrderFood orderFood) {

super(orderFood, 0.99f, " Thousand Island Sauce + ");
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