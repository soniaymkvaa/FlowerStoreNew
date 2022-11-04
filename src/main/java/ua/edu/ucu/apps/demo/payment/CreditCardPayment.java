package ua.edu.ucu.apps.demo.payment;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay() {
        return true;
    }
}