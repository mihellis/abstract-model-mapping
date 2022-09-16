package com.example.abstractmodelmapping.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Data
@Entity
@PrimaryKeyJoinColumn(name = "clownId")
public class Clown extends Performance {
    private Type type;

    public static enum Type {
        ROLES_AND_SKILLS, WHITE_AND_AUGUSTE, SCARY_AND_EVIL, CHARACTER
    }
}
