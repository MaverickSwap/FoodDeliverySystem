package StructuralPattern.DecoratorPattern;

public abstract class payment extends OrderFood {


private OrderFood orderFood;
public OrderFood getFood() {

return orderFood;
}
public void setorderFood(OrderFood orderFood) {

this.orderFood = orderFood;
}

public payment(OrderFood orderFood, float price, String desc) {

super(price, desc);
this.orderFood = orderFood;
}
}