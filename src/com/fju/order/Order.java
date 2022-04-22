package com.fju.order;

public class Order {
    int amount;
    Delivery delivery;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
    }
}
