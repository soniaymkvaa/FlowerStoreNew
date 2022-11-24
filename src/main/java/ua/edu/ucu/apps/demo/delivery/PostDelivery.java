package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.List;

public class PostDelivery implements Delivery{
    @Override
    public String deliver(List<FlowerBucket> items) {
        return "Delivered with post";
    }
}