package main.java.com.oana.proiect.service;

import java.util.List;

import main.java.com.oana.proiect.repository.OrderItemRepository;

@Service
public class OrderItemService {

    private final OrderItemRepository orderItemRepository;

    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItemService> getAllOrderItems() {
        return orderItemRepository.findAll();
    }

    public OrderItemService getOrderItemById(Long id) {
        return ((Object) orderItemRepository.findById(id)).orElse(null);
    }

    public List<OrderItemService> getOrderItemsByOrderId(Long orderId) {
        return orderItemRepository.findByOrderId(orderId);
    }

    public List<OrderItemService> getOrderItemsByBookId(Long bookId) {
        return orderItemRepository.findByBookId(bookId);
    }

    public OrderItemService saveOrderItem(OrderItemService orderItem) {
        return orderItemRepository.save(orderItem);
    }

    public void deleteOrderItem(Long id) {
        orderItemRepository.deleteById(id);
    }
}

