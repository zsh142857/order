package com.fju.order;

import java.util.ArrayList;
import java.util.List;
/*
   以下是訂單處理程式，一個訂單有金額與運送方式
   7-11 60元
   全家 60元
   萊爾富 50元
   蝦皮店到店 19元
   請在不更動OrderRunner的前提下，修改與增加設計必要類別以完成功能
   執行結果在 result.txt
 */
public class OrderRunner {
    public static void main(String[] args) {
        Delivery sevenEleven = new Seven11Delivery();
        Delivery family = new FamilyDelivery();
        Delivery hiLife = new HiLifeDelivery();
        Delivery shopee = new ShopeeDelivery();
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(700, sevenEleven));
        orders.add(new Order(250, family));
        orders.add(new Order(550, hiLife));
        orders.add(new Order(220, shopee));
        orders.add(new Order(130, shopee));
        System.out.println("金額\t運送\t運費\t小計");
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            System.out.println(order.amount + "\t" + order.delivery.name + "\t" +
                    order.shipFeed + "\t" + order.total());
        }
    }
}
