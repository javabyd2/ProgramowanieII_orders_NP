package com.sdabyd2.programowanie;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws IOException {

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
        try {
            ObjectMapper mapper = new ObjectMapper();
            File fieName = new File("order.json");
            fieName.createNewFile();
            mapper.writeValue(fieName, order);
        }catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
