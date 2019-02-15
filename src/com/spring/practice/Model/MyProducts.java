package com.spring.practice.Model;


public class MyProducts {
    private String name;
    private int quantity;
    private int price;

    public MyProducts() {

    }

    public MyProducts(String name, int quantity, int price) {
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int qantity) {
        this.quantity = qantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name+"||"+quantity+"||"+price;
    }
}
