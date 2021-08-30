package org.lekayn.mydelivery.repository;
import org.lekayn.mydelivery.model.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

/** #### Интерфейс взаимодействия с таблицей БД cafe(рестораны) */

public interface CafeRepository extends JpaRepository<Cafe, Long> {

}
