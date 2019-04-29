package cz.upce.inpia.simpleshop.service;

import cz.upce.inpia.simpleshop.dao.OrderFormDao;
import cz.upce.inpia.simpleshop.entity.OrderForm;
import java.util.List;
import java.util.NoSuchElementException;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class OrdersServiceImpl implements OrdersService {

  private OrderFormDao orderFormDao;

  @Autowired
  public OrdersServiceImpl(OrderFormDao orderFormDao){
    this.orderFormDao = orderFormDao;
  }

  @Override
  public List<OrderForm> findAllOrders() {
    return orderFormDao.findAll();
  }

  @Override
  public OrderForm findById(Integer orderId) {
    if (orderFormDao.findById(orderId).isPresent()) {
      return orderFormDao.findById(orderId).get();
    } else {
      throw new NoSuchElementException("Order with ID: " + orderId + " was not found!");
    }
  }


}
