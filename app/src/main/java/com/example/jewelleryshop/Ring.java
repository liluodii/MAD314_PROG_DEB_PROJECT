package com.example.jewelleryshop;

public class Ring {
    public String shape;
    public String size;
    public String Pattern;
    public Integer Price;
    public String brand;
    public Integer Image;

    public Ring(String shape, String size, String pattern, Integer price, String brand, Integer image) {
        this.shape = shape;
        this.size = size;
        Pattern = pattern;
        Price = price;
        this.brand = brand;
        Image = image;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPattern() {
        return Pattern;
    }

    public void setPattern(String pattern) {
        Pattern = pattern;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getImage() {
        return Image;
    }

    public void setImage(Integer image) {
        Image = image;
    }
}