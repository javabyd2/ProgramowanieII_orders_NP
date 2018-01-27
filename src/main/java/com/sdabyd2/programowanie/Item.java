package com.sdabyd2.programowanie;

public class Item {

    String name;
    int itemCount;
    int price;

    public Item(String name, int itemCount, int price){
        this.name = name;
        this.itemCount = itemCount;
        this.price = price;
    }
    public double countPrice(){
        int sum = price * itemCount;
        return sum;
    }

    @Override
    public String toString() {
        return name + "\t" + price + " zł\t" + itemCount + " szt.\t" + countPrice() + " zł";
    }
}
