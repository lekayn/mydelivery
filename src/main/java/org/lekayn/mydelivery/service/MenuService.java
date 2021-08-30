package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Menu;
import org.lekayn.mydelivery.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/** #### Сервис для работы с репозиторием Меню MenuService
 * Реализует интерфейс IMenuService
 * Реализует репозиторий Меню - menuRepository  */

@Service
public class MenuService implements IMenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    /** ##### Методы:
     *  - findMenuByCafeId(Long id) - "Получить меню ресторана" */
    @Override
    public Optional<Menu> findMenuByCafeId(Long id) {
        return menuRepository.findByCafe_CafeId(id);
    }
}
