package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Orders;
import org.lekayn.mydelivery.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService implements IOrdersService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public Boolean save(Orders order) {
        if (ordersRepository.save(order) != null) {
            return true;
        } else return false;

    }
}
