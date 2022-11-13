package ua.edu.ucu.apps.demo.flower;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "flower")
@NoArgsConstructor
public class Flower {
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
}