package com.example.abstractmodelmapping.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
public class TrapezeDTO extends PerformanceDTO {

    private Type type;

    public static enum Type {
        STATIC, SWINGING, FLYING
    }

}