package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.OrderDishes;
import org.lekayn.mydelivery.repository.OrderDishesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** #### Сервис для работы с репозиторием Блюда заказа OrderDishesService
 * Реализует интерфейс IOrderDishesService
 * Реализует репозиторий Блюда заказа - orderDishesRepository */

@Service
public class OrderDishesService implements IOrderDishesService {
    private final OrderDishesRepository orderDishesRepository;

    @Autowired
    public OrderDishesService(OrderDishesRepository orderDishesRepository) {
        this.orderDishesRepository = orderDishesRepository;
    }
    /** ##### Методы:
     *  - saveALl(List<OrderDishes> orderDishesList) - "Сохранить список блюд заказа в БД" */
    @Override
    public Boolean saveALl(List<OrderDishes> orderDishesList) {
        return orderDishesRepository.saveAll(orderDishesList) != null;
    }
}
