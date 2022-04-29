package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;
    int shipFeed;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
        shipFeed=delivery.price;
    }
    public int  total(){
        return amount+shipFeed;
    }


}
