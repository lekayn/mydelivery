package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.OrderDishes;

import java.util.List;

/** Интерфейс взаимодействия контролера с моделью - с сущностью OrderDishes(Блюда заказа)   */

public interface IOrderDishesService {
    Boolean saveALl(List<OrderDishes> orderDishesList);
}
