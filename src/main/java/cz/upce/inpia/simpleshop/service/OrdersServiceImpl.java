package cz.upce.inpia.simpleshop.service;

import cz.upce.inpia.simpleshop.dao.OrderFormDao;
import cz.upce.inpia.simpleshop.entity.OrderForm;
import cz.upce.inpia.simpleshop.entity.Product;
import java.util.ArrayList;
import java.util.List;
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
}
