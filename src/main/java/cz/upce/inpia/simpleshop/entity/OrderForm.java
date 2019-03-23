package cz.upce.inpia.simpleshop.entity;

import cz.upce.inpia.simpleshop.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class OrderForm extends BaseEntity {

    @OneToMany(mappedBy = "id")
    private Set<OrderedProduct> orderedProducts;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    public Set<OrderedProduct> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(Set<OrderedProduct> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
}
