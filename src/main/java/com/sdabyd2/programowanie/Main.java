package com.sdabyd2.programowanie;

public class Main {

    public static void main(String[] args) {

        Item bread = new Item("chleb", 1, 3);
        Item butter = new Item("masło", 2, 5);
        Order order = new Order();
        order.addItem(bread);
        order.addItem(butter);
        order.countTotal();
        order.removeItem(1);
        System.out.println(order.toString());
    }
}
