package com.example.abstractmodelmapping.controller;

import com.example.abstractmodelmapping.dto.*;
import com.example.abstractmodelmapping.entity.*;
import com.example.abstractmodelmapping.service.CircusService;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@RestController
@RequestMapping("/api")
public class CircusController {

    private CircusService circusService;
    private ModelMapper mapper;
    @Autowired
    public CircusController(CircusService circusService, ModelMapper mapper) {
        this.circusService = circusService;
        this.mapper = mapper;
    }

    /**
     * Adds a circus performance.
     *
     * @param newCircusDTO             a POJO holding the json that was passed in containing the vehicle details
     * @return                          the generated uuid (key) of the added vehicle
     */
    @PostMapping("/circus")
    public ResponseEntity<CircusDTO> addVehicle(@RequestBody CircusDTO newCircusDTO) {

        Circus circus = this.circusService.addCircus(mapToEntity(newCircusDTO));

        return ResponseEntity.ok(mapToDTO(circus));
    }

    private Circus mapToEntity(CircusDTO circusDTO) {
        ModelMapper mapper = new ModelMapper();
        mapper.typeMap(ClownDTO.class, Performance.class)
                .setConverter(converterWithDestinationSupplier(Clown::new));
        mapper.typeMap(UnicylceDTO.class, Performance.class)
                .setConverter(converterWithDestinationSupplier(Unicylce::new));
        mapper.typeMap(TrapezeDTO.class, Performance.class)
                .setConverter(converterWithDestinationSupplier(Trapeze::new));;
           return mapper.map(circusDTO, Circus.class);

    }

    private CircusDTO mapToDTO(Circus circus) {
        ModelMapper mapper = new ModelMapper();
        mapper.typeMap(Clown.class, PerformanceDTO.class)
                .setConverter(converterWithDestinationSupplier(ClownDTO::new));
        mapper.typeMap(UnicylceDTO.class, PerformanceDTO.class)
                .setConverter(converterWithDestinationSupplier(UnicylceDTO::new));
        mapper.typeMap(TrapezeDTO.class, PerformanceDTO.class)
                .setConverter(converterWithDestinationSupplier(TrapezeDTO::new));;
        return mapper.map(circus, CircusDTO.class);

    }



    private <S, D> Converter<S, D> converterWithDestinationSupplier(Supplier<? extends D> supplier ) {
        return ctx -> ctx.getMappingEngine().map(ctx.create(ctx.getSource(), supplier.get()));
    }

}
