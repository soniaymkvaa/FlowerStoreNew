package ua.edu.ucu.apps.demo.delivery;

import ua.edu.ucu.apps.demo.flower.FlowerBucket;
import ua.edu.ucu.apps.demo.item.Item;

import java.util.List;

public interface Delivery {
    String deliver(List<FlowerBucket> flowerBuckets);
}