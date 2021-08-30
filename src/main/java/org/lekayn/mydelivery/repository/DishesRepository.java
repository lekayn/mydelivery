package org.lekayn.mydelivery.repository;

import org.lekayn.mydelivery.model.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishesRepository extends JpaRepository<Dishes, Long> {

}
