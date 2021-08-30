package org.lekayn.mydelivery.repository;

import org.lekayn.mydelivery.model.OrderDishes;
import org.springframework.data.jpa.repository.JpaRepository;

/** #### Интерфейс взаимодействия с таблицей БД order_dishes(блюда заказа) */

public interface OrderDishesRepository extends JpaRepository<OrderDishes, Long> {

}
