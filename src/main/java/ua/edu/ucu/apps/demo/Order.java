package ua.edu.ucu.apps.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;

import java.util.List;
public class Order {
    @Getter
    List<FlowerBucket> items;
    @Setter @Getter
    Payment payment;
    @Setter @Getter
    Delivery delivery;
    public void addItem(FlowerBucket item){
        items.add(item);
    }
    public void removeItem(FlowerBucket item){
        items.remove(item);
    }
    public void processOrder(){
        payment.pay();
        delivery.deliver(items);
    }
    public float calculateTotalPrice(){
        float res = 0;
        for (FlowerBucket bucket : items){
            res += bucket.getPrice();
        }
        return res;
    }
}