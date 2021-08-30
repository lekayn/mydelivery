package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Orders;
import org.lekayn.mydelivery.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** #### Сервис для работы с репозиторием Заказы OrdersService
 * Реализует интерфейс IOrdersService
 * Реализует репозиторий Заказы - OrdersRepository */

@Service
public class OrdersService implements IOrdersService {
    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

/** ##### Методы:
 * - save(Orders order) - сохранить данные заказа в БД */
    @Override
    public Boolean save(Orders order) {
        return ordersRepository.save(order) != null;

    }
}
