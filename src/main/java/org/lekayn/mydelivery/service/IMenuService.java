package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Menu;

import java.util.Optional;

public interface IMenuService {

    /**
     * Возвращает меню по идентификатору кафе, которому оно принадлежит
     * */
    Optional<Menu> findMenuByCafeId(Long id);
}
