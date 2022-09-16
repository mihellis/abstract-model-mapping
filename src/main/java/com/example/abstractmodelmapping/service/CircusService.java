package com.example.abstractmodelmapping.service;

import com.example.abstractmodelmapping.entity.Circus;

public interface CircusService {
    Circus getCircus(Long circusId);
    Circus addCircus(Circus circus);

}
