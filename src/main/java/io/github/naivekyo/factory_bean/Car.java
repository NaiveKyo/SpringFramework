package io.github.naivekyo.factory_bean;

/**
 * @author NaiveKyo
 * @version 1.0
 * @since 2022/3/18 16:23
 */
public class Car {
    
    private int maxSpeed;
    
    private String brand;
    
    private double price;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
