package com.example.abstractmodelmapping.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "unicycleId")
@Data
public class Unicylce extends Performance {

    private Type type;

    public static enum Type {
        FREESTYLE, GIRAFFE, TRIAL
    }
}
