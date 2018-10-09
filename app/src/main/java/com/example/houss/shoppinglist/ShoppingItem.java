package com.example.houss.shoppinglist;

public class ShoppingItem {

    private String name;

    private String category;

    private int number;

    private String details;

    private boolean purchased;

    public ShoppingItem(String name, String category, int number, String details, boolean purchased) {
        this.name = name;
        this.category = category;
        this.number = number;
        this.details = details;
        this.purchased = purchased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getNumber() { return String.valueOf(number); }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean getPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }
}