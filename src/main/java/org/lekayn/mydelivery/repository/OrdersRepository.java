package org.lekayn.mydelivery.repository;

import org.lekayn.mydelivery.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
