package com.sdabyd2.programowanie;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private int addedCount;
    private int maxSize;

    public Order(){
        maxSize = 10;
        items = new ArrayList<>();
    }

    public Order(int maxSize){
        this.maxSize = maxSize;
        items = new ArrayList<>();
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
       if(items.stream().anyMatch(o->o.getName().equals(item.getName()))) {
           items.stream().filter(x -> x.getName().equals(item.getName()))
                   .findAny().ifPresent(x -> x.setItemCount(x.getItemCount() + item.getItemCount()));
       }else{
           items.add(item);
           addedCount += 1;}
    }
    public double countTotal(){
        double total = 0;
        for (Item item : items) {
            total += item.countPrice();
        }
        DecimalFormat format = new DecimalFormat("###.##");
        String temp = format.format(total);
        return Double.parseDouble(temp);
    }
    public void removeItem(int index){
        items.remove(index);
    }
    public void editItem(int index){
        items.get(index);
    }
}
