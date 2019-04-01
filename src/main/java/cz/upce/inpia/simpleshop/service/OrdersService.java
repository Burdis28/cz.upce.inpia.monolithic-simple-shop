package cz.upce.inpia.simpleshop.service;

import cz.upce.inpia.simpleshop.entity.OrderForm;
import java.util.List;

public interface OrdersService {

  List<OrderForm> findAllOrders();

  OrderForm findById(Integer orderId);

}
