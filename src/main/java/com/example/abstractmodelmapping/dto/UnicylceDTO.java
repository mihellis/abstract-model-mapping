package com.example.abstractmodelmapping.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


public class UnicylceDTO extends PerformanceDTO {

    private Type type;

    public static enum Type {
        FREESTYLE, GIRAFFE, TRIAL
    }
}
