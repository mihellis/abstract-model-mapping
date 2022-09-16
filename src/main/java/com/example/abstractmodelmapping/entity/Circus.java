package com.example.abstractmodelmapping.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Circus {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    @OneToMany(mappedBy = "circus", cascade = CascadeType.ALL)
    List<Performance> performances;
}
