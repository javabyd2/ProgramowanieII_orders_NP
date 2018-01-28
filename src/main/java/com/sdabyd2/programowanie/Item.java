package com.sdabyd2.programowanie;

public class Item {

    private String name;
    private int itemCount;
    private int price;

    public Item(String name, int itemCount, int price){
        this.name = name;
        this.itemCount = itemCount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double countPrice(){
        int sum = price * itemCount;
        return sum;
    }

    @Override
    public String toString() {
        return "\n" + name + "\t" + price + " zł\t" + itemCount + " szt.\t" + countPrice() + " zł";
    }
}
