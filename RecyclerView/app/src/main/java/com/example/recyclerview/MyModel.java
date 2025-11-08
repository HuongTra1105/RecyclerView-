package com.example.recyclerview;

public class MyModel {
    private String name123;
    private String price123;
    private int image123;

    public MyModel(String name, String price, int image) {
        this.name123 = name;
        this.price123 = price;
        this.image123 = image;
    }

    public String getName() {
        return name123;
    }

    public void setName(String name) {
        this.name123 = name;
    }

    public String getPrice() {
        return price123;
    }

    public void setPrice(String price) {
        this.price123 = price;
    }

    public int getImage() {
        return image123;
    }

    public void setImage(int image) {
        this.image123 = image;
    }
}
