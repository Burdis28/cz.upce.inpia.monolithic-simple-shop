package cz.upce.inpia.simpleshop.controller.rest;

import cz.upce.inpia.simpleshop.entity.OrderForm;
import cz.upce.inpia.simpleshop.entity.Product;
import cz.upce.inpia.simpleshop.service.OrdersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/orders")
@CrossOrigin
public class RestOrdersController {

  private OrdersService ordersService;

  @Autowired
  RestOrdersController(OrdersService ordersService){
    this.ordersService = ordersService;
  }

  @GetMapping()
  public List<OrderForm> getAllOrders(){
    return ordersService.findAllOrders();
  }

  @GetMapping("{orderId}")
  public OrderForm getOrderById(@PathVariable Integer orderId) {
    return ordersService.findById(orderId);
  }
}