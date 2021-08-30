package org.lekayn.mydelivery.repository;

import org.lekayn.mydelivery.model.OrderDishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDishesRepository extends JpaRepository<OrderDishes, Long> {

}
