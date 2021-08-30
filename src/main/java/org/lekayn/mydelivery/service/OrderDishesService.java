package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.OrderDishes;
import org.lekayn.mydelivery.repository.OrderDishesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDishesService implements IOrderDishesService {
    private final OrderDishesRepository orderDishesRepository;

    @Autowired
    public OrderDishesService(OrderDishesRepository orderDishesRepository) {
        this.orderDishesRepository = orderDishesRepository;
    }

    @Override
    public Boolean saveALl(List<OrderDishes> orderDishesList) {
        if (orderDishesRepository.saveAll(orderDishesList) != null) {
            return true;
        } else return false;
    }
}
