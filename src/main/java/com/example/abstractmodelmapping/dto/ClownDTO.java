package com.example.abstractmodelmapping.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Getter
@Setter
public class ClownDTO extends PerformanceDTO {
    private Type type;

    public static enum Type {
        ROLES_AND_SKILLS, WHITE_AND_AUGUSTE, SCARY_AND_EVIL, CHARACTER
    }
}
