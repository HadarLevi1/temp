package com.dev.Objects;

public class Product {
    private String description;
    private int price;
    private boolean existing;

    public Product(String description, int price, boolean existing) {
        this.description = description;
        this.price = price;
        this.existing = existing;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }
}
