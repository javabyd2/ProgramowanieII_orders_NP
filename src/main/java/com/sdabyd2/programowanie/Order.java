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

    @Override
    public String toString() {
        String itemList = "";
        for (Item item : items) {
            itemList += item.toString();
        }
        return "Zamówienie:\n" + itemList + "\n\nRazem: " + countTotal() + " zł";
    }

    public void addItem(Item item){
        addedCount = 0;
        if(items[addedCount]!=null){
            addedCount += 1;
        }
        items[addedCount] = item;
    }
    public double countTotal(){
        double total = 0;
        for(int i = 0; i<items.length; i++){
            total += items[i].countPrice();
        }
        return total;
    }
}
