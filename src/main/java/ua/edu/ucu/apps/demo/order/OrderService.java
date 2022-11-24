package ua.edu.ucu.apps.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.edu.ucu.apps.demo.flower.FlowerRepository;
import ua.edu.ucu.apps.demo.user.User;
import ua.edu.ucu.apps.demo.user.UserRepository;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAll() {
        return orderRepository.getAll();
    }

    public String info(int id) {
        Order order = orderRepository.getId(id);
        return order.processOrder();
    }

    public int addOrder(Order order) {
        return orderRepository.save(order);
    }
}

