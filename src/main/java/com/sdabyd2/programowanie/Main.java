package com.sdabyd2.programowanie;

public class Main {

    public static void main(String[] args) {

        Item bread = new Item("chleb", 1, 2.60);
        Item butter = new Item("masło", 2, 5.00);
        Item potato = new Item("ziemniaki", 30, 0.50);
        Order order = new Order();
        order.addItem(bread);
        order.addItem(butter);
        order.addItem(potato);
        order.removeItem(1);
        Item jam = new Item("dżem", 6, 2.60);
        order.addItem(jam);

        Item testSameItem = new Item("chleb", 1, 2.60);
        order.addItem(testSameItem);
        System.out.println(order.toString());


    }
}
