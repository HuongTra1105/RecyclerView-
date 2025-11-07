package com.example.recyclerview;

public class MyModel {
    private String name;   // Tên món ăn
    private String price;  // Giá món ăn (dạng chuỗi, ví dụ: "40.000đ")
    private int image;     // ID hình ảnh (R.drawable.xxx)

    public MyModel(String name, String price, int image) {
        this.name = name;
        this.price = price;
        this.image = image;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
