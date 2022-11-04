package ua.edu.ucu.apps.demo.flower;


import java.util.ArrayList;

public class Store {
    ArrayList<FlowerBucket> packs = new ArrayList<FlowerBucket>();
    public FlowerBucket searchCheapest(){
        FlowerBucket cheapest = new FlowerBucket();
        double price = 100000000;
        for (FlowerBucket bucket: this.packs) {
            if (bucket.getPrice() < price){
                cheapest = bucket;
                price = bucket.getPrice();
            }
        }
        return cheapest;
    }
    public void add(FlowerBucket bucket) {
        packs.add(bucket);
    }
}