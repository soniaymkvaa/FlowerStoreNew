package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.Setter;



@Setter
public class Flower {
    private FlowerColor color;
    @Getter
    private double sepalLength;

    @Getter
    private double price;

    @Getter
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
}