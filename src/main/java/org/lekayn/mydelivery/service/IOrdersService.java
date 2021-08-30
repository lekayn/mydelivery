package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Orders;

/** Интерфейс взаимодействия контролера с моделью - с сущностью Order(Заказ)   */

public interface IOrdersService {
    /** сохраняет данные заказа в БД */
    Boolean save(Orders order);
}
