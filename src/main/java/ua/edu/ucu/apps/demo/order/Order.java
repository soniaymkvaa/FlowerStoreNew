package ua.edu.ucu.apps.demo.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ua.edu.ucu.apps.demo.delivery.Delivery;
import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;
import ua.edu.ucu.apps.demo.payment.Payment;
import ua.edu.ucu.apps.demo.user.UserInterface;

import java.util.List;

@NoArgsConstructor
@Setter
@Getter
public class Order {

    private List<FlowerBucket> flowerBuckets;

    private Payment payment;

    private Delivery delivery;
    private int id;
    private List<UserInterface> users;
    public void addItem(FlowerBucket flowerBucket){
        flowerBuckets.add(flowerBucket);
    }
    public void removeItem(FlowerBucket flowerBucket){
        flowerBuckets.remove(flowerBucket);
    }
    public void notify(String info) {
        for (UserInterface user: users) {
            user.update(info);
        }
    }
    public String processOrder(){
        String pInfo = String.valueOf(payment.pay());
        notify("Completed");
        String dInfo = delivery.deliver(flowerBuckets);
        notify("Delivered");
        return pInfo + ", " + dInfo;
    }
    public float calculateTotalPrice(){
        float res = 0;
        for (FlowerBucket bucket : flowerBuckets){
            res += bucket.getPrice();
        }
        return res;
    }
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    public double getPrice() {
        return flowerBuckets.stream().mapToDouble(FlowerBucket::getPrice).sum();
    }
}