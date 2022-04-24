package BehavioralPatterns.command.receiver;

public class Order {

    private String foodItem;
    private Integer foodQuantity;

    private boolean orderPlaced;
    private boolean orderValidated;
    private boolean orderPrepared;
    private boolean orderServed;

    public Order(String foodItem, Integer foodQuantity) {
        this.foodItem = foodItem;
        this.foodQuantity = foodQuantity;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public Integer getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(Integer foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public boolean isOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(boolean orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public boolean isOrderValidated() {
        return orderValidated;
    }

    public void setOrderValidated(boolean orderValidated) {
        this.orderValidated = orderValidated;
    }

    public boolean isOrderPrepared() {
        return orderPrepared;
    }

    public void setOrderPrepared(boolean orderPrepared) {
        this.orderPrepared = orderPrepared;
    }

    public boolean isOrderServed() {
        return orderServed;
    }


    public void setOrderServed(boolean orderServed) {
        this.orderServed = orderServed;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("Order [ ")
                .append(foodItem).append(", ").append(foodQuantity).append("\r\n")
                .append("Placed : ").append(orderPlaced).append("\r\n")
                .append("Validated : ").append(orderValidated).append("\r\n")
                .append("Prepared : ").append(orderPrepared).append("\r\n")
                .append("Delivered : ").append(orderServed).append("\r\n")
                .append("] \r\n");

        return sb.toString();
    }


}
