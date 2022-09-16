package com.example.abstractmodelmapping.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "trapezeId")
public class Trapeze extends Performance {

    private Type type;

    public static enum Type {
        STATIC, SWINGING, FLYING
    }

}