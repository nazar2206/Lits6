package com.lits1;

public class ProductOrder {
    private int id;
    private int price;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "id " + id +
                " - price " + price +
                " - size " + size +
                " - type " + productType +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public ProductOrder(int id, int price, int size, String productType) {
        this.id = id;
        this.price = price;
        this.size = size;
        this.productType = productType;
    }

    private int size;
    private String productType;
}
