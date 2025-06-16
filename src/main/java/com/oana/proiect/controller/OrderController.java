package com.oana.proiect.controller;

import org.springframework.web.bind.annotation.*;
import com.oana.proiect.model.Order;
import com.oana.proiect.service.OrderService;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();  // retturneaza toate comenzile 
    }

    @GetMapping("/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return (Order) orderService.getOrderById(id);  //retuneaza o comanda dupa id
    }

    @GetMapping("/customer/{customerId}")
    public List<Order> getOrdersByCustomerId(@PathVariable Long customerId) {
        return orderService.getOrdersByCustomerId(customerId);  //retureaza comenzile unui client dupa id ul lui
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return (Order) orderService.saveOrder(order);  //creaaza o comanda noua si o salveaza 
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);    //sterge o comanda dupa id-ul ei
    }
}
