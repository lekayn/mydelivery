package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.OrderDishes;

import java.util.List;

public interface IOrderDishesService {
    Boolean saveALl(List<OrderDishes> orderDishesList);
}
