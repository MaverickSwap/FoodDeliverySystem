package StructuralPattern.DecoratorPattern;

public abstract class Extras extends OrderFood {


    private OrderFood orderFood;

    public OrderFood getFood() {
        return orderFood;
    }

    public void setOrderFood(OrderFood orderFood) {
        this.orderFood = orderFood;
    }

    public Extras(OrderFood orderFood, float price, String desc) {
        super(price, desc);
        this.orderFood = orderFood;
    }
}