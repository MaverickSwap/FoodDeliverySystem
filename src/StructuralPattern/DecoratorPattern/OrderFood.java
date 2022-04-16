package StructuralPattern.DecoratorPattern;

public abstract class OrderFood {

    private float price;
    private String desc;

    public OrderFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public OrderFood() {

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public abstract float cost();
}