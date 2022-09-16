package com.example.abstractmodelmapping.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private String name;
    private int duration;
    @ManyToOne
    @JoinColumn(name = "circus_id", nullable = false)
    private Circus circus;
}
