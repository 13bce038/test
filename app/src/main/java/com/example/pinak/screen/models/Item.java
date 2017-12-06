package com.example.pinak.screen.models;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String number, date, value;

    private Item(String number, String date, String value) {
        this.number = number;
        this.date = date;
        this.value = value;
    }

    /**
     * static method for returning data
     *
     * @return return static list of data for testing purpose
     */
    public static List<Item> prepareData() {
        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            itemList.add(new Item("137******04", "2017-11-06 13:41:05", "3.58gram"));
        }
        return itemList;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
