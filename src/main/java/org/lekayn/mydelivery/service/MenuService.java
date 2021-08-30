package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Menu;
import org.lekayn.mydelivery.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MenuService implements IMenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuService(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public Optional<Menu> findMenuByCafeId(Long id) {
        return menuRepository.findByCafe_CafeId(id);
    }
}
