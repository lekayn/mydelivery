package org.lekayn.mydelivery.repository;

import org.lekayn.mydelivery.model.Dishes;
import org.springframework.data.jpa.repository.JpaRepository;

/** #### Интерфейс взаимодействия с таблицей БД dishes(блюда ресторана)*/

public interface DishesRepository extends JpaRepository<Dishes, Long> {

}
