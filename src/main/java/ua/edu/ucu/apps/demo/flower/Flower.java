package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.item.Item;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "flower")
@NoArgsConstructor
public class Flower extends Item{
    @Id
    @GeneratedValue
    private Integer id;
    @Enumerated(EnumType.STRING)
    private FlowerColor color;
    private double sepalLength;

    private double price;

    @Enumerated(EnumType.STRING)
    private FlowerType flowerType;

    public String getColor() {
        return color.toString();
    }
    @Override
    public Double getPrice() {
        return price;
    }
    @Override
    public String getDescription(){
     return "A beautiful flower";
    }




}