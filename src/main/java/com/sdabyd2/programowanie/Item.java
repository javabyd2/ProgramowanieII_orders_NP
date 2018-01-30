package com.sdabyd2.programowanie;

import java.text.DecimalFormat;

public class Item {

    private String name;
    private int itemCount;
    private double price;

    public Item(String name, int itemCount, double price) {
        this.name = name;

        this.itemCount = itemCount;
        this.price = price;
    }

    public void setPrice(double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double countPrice() {
        double sum = price * itemCount;
        if(itemCount>5){
            sum = countPriceWithDiscount();
        }
        DecimalFormat format = new DecimalFormat("###.##");
        String temp = format.format(sum);
        return Double.parseDouble(temp);
    }

    public double countPriceWithDiscount() {
        double sumWithDicount =price*itemCount;
        if (itemCount > 20) {
            sumWithDicount = sumWithDicount * 0.15;
        } else if (itemCount < 20 && itemCount > 10) {
            sumWithDicount = sumWithDicount * 0.10;
        } else if (itemCount < 10 && itemCount > 5) {
            sumWithDicount = sumWithDicount * 0.05;
        }
        return sumWithDicount;
    }

    @Override
    public String toString() {
        return "\n" + name + "\t" + price + " zł\t" + itemCount + " szt.\t" + countPrice() + " zł";
    }
}
