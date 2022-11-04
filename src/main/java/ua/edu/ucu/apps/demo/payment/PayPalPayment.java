package ua.edu.ucu.apps.demo.payment;

import lombok.Getter;

@Getter
public class PayPalPayment implements Payment {
    final String name;
    final String description;
    public PayPalPayment(){
        name = "PayPal payment";
        description = "Some info";
    }

    @Override
    public boolean pay() {
        return true;
    }
}
