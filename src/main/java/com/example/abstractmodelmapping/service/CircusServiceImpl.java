package com.example.abstractmodelmapping.service;

import com.example.abstractmodelmapping.dao.CircusRepository;
import com.example.abstractmodelmapping.dao.PerformanceRepository;
import com.example.abstractmodelmapping.entity.Circus;
import com.example.abstractmodelmapping.entity.Performance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CircusServiceImpl implements CircusService{

    private CircusRepository circusRepository;
    private PerformanceRepository performanceRepository;

    @Autowired
    public CircusServiceImpl(CircusRepository circusRepository,
                             PerformanceRepository performanceRepository) {
        this.circusRepository = circusRepository;
        this.performanceRepository = performanceRepository;
    }

    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE, readOnly = true)
    public Circus  getCircus(Long circusId) {
        Optional<Circus> vehicleOptional = circusRepository.findById(circusId);
        return vehicleOptional.get();
    }
    @Override
    @Transactional(isolation = Isolation.SERIALIZABLE, readOnly = true)
    public Circus  addCircus(Circus circus) {
        circus.getPerformances().stream().forEach(act -> act.setCircus(circus));
        circusRepository.save(circus);

        return circus;
    }

}
