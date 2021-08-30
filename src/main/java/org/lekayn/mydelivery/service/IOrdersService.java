package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Orders;

public interface IOrdersService {
    /**
    * сохраняет данные заказа в БД
     **
     * @return*/
    Boolean save(Orders order);
}
