package cz.upce.inpia.simpleshop.dao;

import cz.upce.inpia.simpleshop.entity.OrderForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderFormDao extends JpaRepository<OrderForm, Integer> {

  //todo: udelej find all s vlastní implementací a selectem z prunikove tabulky, abys zobrazil ke každé objednávce i jména produktů.

}
