package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Cafe;
import org.lekayn.mydelivery.repository.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/** #### Сервис для работы с репозиторием Кафе CafeService
 * Реализует интерфейс ICafeService
 * Реализует репозиторий Кафе - cafeRepository  */

@Service
public class CafeService implements ICafeService {


    private final CafeRepository cafeRepository;

    @Autowired
    public CafeService(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }


    /** ##### Методы:
     *  - findAll() - "Получить список всех ресторанов системы" */
    @Override
    public List<Cafe> findAll() {
        return (List<Cafe>) cafeRepository.findAll();

    }


}
