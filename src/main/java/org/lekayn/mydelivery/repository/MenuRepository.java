package org.lekayn.mydelivery.repository;

import org.lekayn.mydelivery.model.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    Optional<Menu> findByCafe_CafeId(Long cafeId);
}
