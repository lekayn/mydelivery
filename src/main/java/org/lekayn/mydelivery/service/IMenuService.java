package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Menu;

import java.util.Optional;

/** Интерфейс взаимодействия контролера с моделью - с сущностью Menu(Меню ресторана)   */

public interface IMenuService {

    /**
     * Возвращает меню по идентификатору кафе, которому оно принадлежит
     * */
    Optional<Menu> findMenuByCafeId(Long id);
}
