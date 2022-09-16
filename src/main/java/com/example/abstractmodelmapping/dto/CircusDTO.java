package com.example.abstractmodelmapping.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CircusDTO {
    Long id;
    String name;
    List<PerformanceDTO> performances;
}
