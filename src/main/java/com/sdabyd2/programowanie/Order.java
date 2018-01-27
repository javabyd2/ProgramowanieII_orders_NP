package com.sdabyd2.programowanie;

public class Order {
    Item [] items;
    int addedCount;
    int maxSize;

    public Order(){
        maxSize = 10;
        items = new Item[maxSize];
    }

    public Order(int maxSize){
        this.maxSize = maxSize;
        items = new Item[maxSize];
    }
    public void addItems(Item item){
        items[0] = item;
    }
    public double countTotal(){
        return
    }
}
