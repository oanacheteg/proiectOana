package main.java.com.oana.proiect.repository;

import java.util.List;

import main.java.com.oana.proiect.service.OrderItemService;

@com.oana.proiect.repository.Repository
public interface OrderItemRepository<OrderItem> extends JpaRepository<OrderItem, Long> {

    List<OrderItem> findByOrderId(Long orderId);
    List<OrderItem> findByBookId(Long bookId);
    void deleteById(Long id);
    List<OrderItemService> findAll();
	Object findById(Long id);
    OrderItemService save(OrderItemService orderItem);
}
