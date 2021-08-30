package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Cafe;

import java.util.List;

/** Интерфейс взаимодействия контролера с моделью - с сущностью Cafe(Рестораны)   */


public interface ICafeService {
    /**
    * Возвращает список всех кафе(ресторанов), добавленных в БД
    * */
    List<Cafe> findAll();
}
