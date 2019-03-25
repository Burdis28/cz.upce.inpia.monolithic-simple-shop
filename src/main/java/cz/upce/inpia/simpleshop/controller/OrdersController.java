package cz.upce.inpia.simpleshop.controller;

import cz.upce.inpia.simpleshop.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrdersController {

  private OrdersService ordersService;

  @Autowired
  public OrdersController(OrdersService ordersService){
    this.ordersService = ordersService;
  }

  @GetMapping("/listOrders")
  public String showCart(Model model) {
    model.addAttribute("orders", ordersService.findAllOrders());
    return "orders-list";
  }

}
