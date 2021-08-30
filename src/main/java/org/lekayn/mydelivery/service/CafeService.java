package org.lekayn.mydelivery.service;

import org.lekayn.mydelivery.model.Cafe;
import org.lekayn.mydelivery.repository.CafeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CafeService implements ICafeService {


    private final CafeRepository cafeRepository;

    @Autowired
    public CafeService(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }

    @Override
    public List<Cafe> findAll() {
        return (List<Cafe>) cafeRepository.findAll();

    }


}
