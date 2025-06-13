package main.java.com.oana.proiect.service;

import java.util.List;

import main.java.com.oana.proiect.repository.OrderRepository;

@Service
public class OrderService<Order> {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return ((Object) orderRepository.findByCustomerId(id)).orElse(null);
    }

    public List<Order> getOrdersByCustomerId(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

    public Order saveOrder(Order order, Object save) {
        return (Order) save;
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
