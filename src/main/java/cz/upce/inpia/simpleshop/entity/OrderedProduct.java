package cz.upce.inpia.simpleshop.entity;

import cz.upce.inpia.simpleshop.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class OrderedProduct extends BaseEntity {

    @ManyToOne
    private OrderForm order;

    @ManyToOne
    private Product product;

    @Column
    private Integer amount;

    public OrderForm getOrder() {
        return order;
    }

    public void setOrder(OrderForm order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
